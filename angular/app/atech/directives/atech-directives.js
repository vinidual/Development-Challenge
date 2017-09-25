'use strict';

angular.module('app.atech.directives', [])
    .directive('atech', function () {

        var link = function ($scope) {
            console.log('directive');
        };

        return {
            controller: 'atechController',
            link: link,
            templateUrl: 'app/atech/views/atech.tpl.html'
        };

    });
