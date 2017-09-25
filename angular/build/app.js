'use strict';

var appConfig = window.appConfig || {};

appConfig.apiUrl = 'http://localhost:8080/api';

window.appConfig = appConfig;

'use strict';

$(function () {
    angular.bootstrap(document, ['app']);
});

'use strict';

var app = angular.module('app', [
  'ngSanitize',
  'ngAnimate',
  'restangular',
  'ui.router',
  'app.layout',
  'app.atech'
])
.constant('APP_CONFIG', window.appConfig)
.run(function ($location){
  $location.url('/atech');
});

angular.module("app").run(["$templateCache", function($templateCache) {$templateCache.put("app/layout/layout.tpl.html","Teste\n");
$templateCache.put("app/atech/views/atech.tpl.html","\r\n<h2>Atech: Lista de Voos</h2>\r\n\r\n<div ng-repeat=\"flight in listFlights\">\r\n  {{flight}}\r\n</div>\r\n");
$templateCache.put("app/layout/shortcut/shortcut.tpl.html","<div id=\"shortcut\">\n	<ul>\n		<li>\n			<a href=\"#/inbox/\" class=\"jarvismetro-tile big-cubes bg-color-blue\"> <span class=\"iconbox\"> <i class=\"fa fa-envelope fa-4x\"></i> <span>Mail <span class=\"label pull-right bg-color-darken\">14</span></span> </span> </a>\n		</li>\n		<li>\n			<a href=\"#/calendar\" class=\"jarvismetro-tile big-cubes bg-color-orangeDark\"> <span class=\"iconbox\"> <i class=\"fa fa-calendar fa-4x\"></i> <span>Calendar</span> </span> </a>\n		</li>\n		<li>\n			<a href=\"#/maps\" class=\"jarvismetro-tile big-cubes bg-color-purple\"> <span class=\"iconbox\"> <i class=\"fa fa-map-marker fa-4x\"></i> <span>Maps</span> </span> </a>\n		</li>\n		<li>\n			<a href=\"#/invoice\" class=\"jarvismetro-tile big-cubes bg-color-blueDark\"> <span class=\"iconbox\"> <i class=\"fa fa-book fa-4x\"></i> <span>Invoice <span class=\"label pull-right bg-color-darken\">99</span></span> </span> </a>\n		</li>\n		<li>\n			<a href=\"#/gallery\" class=\"jarvismetro-tile big-cubes bg-color-greenLight\"> <span class=\"iconbox\"> <i class=\"fa fa-picture-o fa-4x\"></i> <span>Gallery </span> </span> </a>\n		</li>\n		<li>\n			<a href=\"#/profile\" class=\"jarvismetro-tile big-cubes selected bg-color-pinkDark\"> <span class=\"iconbox\"> <i class=\"fa fa-user fa-4x\"></i> <span>My Profile </span> </span> </a>\n		</li>\n	</ul>\n</div>\n");}]);
'use strict';

angular.module('app.atech', ['ui.router', 'app.atech.controllers', 'app.atech.directives'])
    .config(function ($stateProvider) {
        $stateProvider
            .state('app.atech', {
                url: '/atech',
                data: {
                    title: 'Atech'
                },
                views: {
                    root: {
                        controller: 'AtechController',
                        templateUrl: 'app/atech/views/atech.tpl.html'
                    }
                }
            })
    });

"use strict";

angular.module('app.layout', ['ui.router'])
    .config(function ($stateProvider, $urlRouterProvider) {

        $stateProvider
            .state('app', {
                abstract: true,
                views: {
                    root: {
                        templateUrl: 'app/layout/layout.tpl.html'
                    }
                }
            });
            
        $urlRouterProvider.otherwise('/atech');
    });

'use strict';

angular.module('app.atech.controllers', [])
    .controller('atechController', ['$http', 'APP_CONFIG', '$scope',

    function ($http, APP_CONFIG, $scope) {

      $scope.listFlights = [];

      $http({

        method: 'GET',
        url: APP_CONFIG.apiUrl + '/flight'

      }).then(function successCallback(data) {

          console.log(data);
          $scope.listFlights = data.data;

      }, function errorCallback(error) {

          console.log(error);

      });

    }]);

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

"use strict";

angular.module('app').directive('toggleShortcut', function($log,$timeout) {

	var initDomEvents = function($element){

		var shortcut_dropdown = $('#shortcut');

		$element.on('click',function(){

			if (shortcut_dropdown.is(":visible")) {
				shortcut_buttons_hide();
			} else {
				shortcut_buttons_show();
			}

		})

		shortcut_dropdown.find('a').click(function(e) {
			e.preventDefault();
			window.location = $(this).attr('href');
			setTimeout(shortcut_buttons_hide, 300);
		});



		// SHORTCUT buttons goes away if mouse is clicked outside of the area
		$(document).mouseup(function(e) {
			if (shortcut_dropdown && !shortcut_dropdown.is(e.target) && shortcut_dropdown.has(e.target).length === 0) {
				shortcut_buttons_hide();
			}
		});

		// SHORTCUT ANIMATE HIDE
		function shortcut_buttons_hide() {
			shortcut_dropdown.animate({
				height : "hide"
			}, 300, "easeOutCirc");
			$('body').removeClass('shortcut-on');

		}

		// SHORTCUT ANIMATE SHOW
		function shortcut_buttons_show() {
			shortcut_dropdown.animate({
				height : "show"
			}, 200, "easeOutCirc");
			$('body').addClass('shortcut-on');
		}
	}

	var link = function($scope,$element){
		$timeout(function(){
			initDomEvents($element);
		});
	}

	return{
		restrict:'EA',
		link:link
	}
})
