var es = require('event-stream');
var gulp = require('gulp');
var concat = require('gulp-concat');
var connect = require('gulp-connect');
var templateCache = require('gulp-angular-templatecache');
var ngAnnotate = require('gulp-ng-annotate');
var uglify = require('gulp-uglify');
var fs = require('fs');
var _ = require('lodash');
var exec = require('child_process').exec;

var scripts = require('./app.scripts.json');

var source = {
    js: {
        main: 'app/main.js',
        src: [
            // application config
            'app.config.js',
            // application bootstrap file
            'app/main.js',
            // main module
            'app/app.js',
            // module files
            'app/**/module.js',
            // other js files [controllers, services, etc.]
            'app/**/!(module)*.js',
        ],
        tpl: ['app/**/*.tpl.html']
    }
};

var destinations = {
    js: 'build'
};

//Remove readonly from folders and files
gulp.task('remove-readonly', function (cb) {
    exec('attrib -r build/*.* /s', function (err, stdout, stderr) {
        cb(err);
    });
})

gulp.task('build', function () {
    return es.merge(gulp.src(source.js.src), getTemplateStream())
         .pipe(ngAnnotate())
         .pipe(uglify())
        .pipe(concat('app.js'))
        .pipe(gulp.dest(destinations.js));
});

gulp.task('js', function () {
    return es.merge(gulp.src(source.js.src), getTemplateStream())
        .pipe(concat('app.js'))
        .pipe(gulp.dest(destinations.js));
});

gulp.task('watch', function () {
    gulp.watch(source.js.src, ['remove-readonly', 'js']);
    gulp.watch(source.js.tpl, ['remove-readonly', 'js']);
});

gulp.task('connect', function () {
    connect.server({
        port: 8888
    });
});

gulp.task('vendor', function () {
    _.forIn(scripts.chunks, function (chunkScripts, chunkName) {
        var paths = [];
        chunkScripts.forEach(function (script) {
            var scriptFileName = scripts.paths[script];
            if (!fs.existsSync(__dirname + '/' + scriptFileName)) {
                throw console.error('Required path doesn\'t exist: ' + __dirname + '/' + scriptFileName, script)
            }
            paths.push(scriptFileName);
        });
        gulp.src(paths)
            .pipe(concat(chunkName + '.js'))
            .pipe(gulp.dest(destinations.js))
    })
});

gulp.task('dev', ['remove-readonly', 'vendor', 'js', 'watch', 'connect']);
gulp.task('default', ['dev']);


var getTemplateStream = function () {
    return gulp.src(source.js.tpl)
        .pipe(templateCache({
            root: 'app/',
            module: 'app'
        }))
};
