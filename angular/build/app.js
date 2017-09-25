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
$templateCache.put("app/atech/views/atech.tpl.html","\r\n<div class=\"modal fade\" id=\"detail\" role=\"dialog\">\r\n  <div class=\"modal-dialog\" style=\"width:70%\">\r\n\r\n    <div class=\"modal-content\">\r\n      <div class=\"modal-header\">\r\n        <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n        <h4 class=\"modal-title\">Flight Details</h4>\r\n      </div>\r\n      <div class=\"modal-body row\">\r\n\r\n        <div class=\"col-md-12\">\r\n          <legend>Airplane</legend>\r\n        </div>\r\n        <div class=\"col-md-6\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-model\">Model</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.airplane.model\"\r\n              aria-describedby=\"basic-addon-model\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-6\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-company\">Company</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.airplane.company\"\r\n              aria-describedby=\"basic-addon-company\" readonly>\r\n          </div>\r\n        </div>\n        <div class=\"col-md-6\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-cargo\">Cargo Capacity</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.airplane.cargoCapacity\"\r\n              aria-describedby=\"basic-addon-cargo\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-6\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-passenger\">Passenger Capacity</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.airplane.passengerCapacity\"\r\n              aria-describedby=\"basic-addon-passenger\" readonly>\r\n          </div>\r\n        </div>\r\n\r\n        <div class=\"col-md-12\" style=\"margin-top:20px\">\r\n          <legend>Destiny City</legend>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-country\">Country</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.destinyCity.country\"\r\n              aria-describedby=\"basic-addon-country\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-name\">Name</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.destinyCity.name\"\r\n              aria-describedby=\"basic-addon-name\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-state\">State or Province</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.destinyCity.stateOrProvince\"\r\n              aria-describedby=\"basic-addon-state\" readonly>\r\n          </div>\r\n        </div>\r\n\r\n        <div class=\"col-md-12\" style=\"margin-top:20px\">\r\n          <legend>Origin City</legend>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-country\">Country</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.originCity.country\"\r\n              aria-describedby=\"basic-addon-country\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-name\">Name</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.originCity.name\"\r\n              aria-describedby=\"basic-addon-name\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-state\">State or Province</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.originCity.stateOrProvince\"\r\n              aria-describedby=\"basic-addon-state\" readonly>\r\n          </div>\r\n        </div>\r\n\r\n        <div class=\"col-md-12\" style=\"margin-top:20px\">\r\n          <legend>Pilot</legend>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-company\">Company</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.pilot.companyName\"\r\n              aria-describedby=\"basic-addon-company\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-licence\">Licence</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.pilot.flightLicence\"\r\n              aria-describedby=\"basic-addon-licence\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-gender\">Gender</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.pilot.gender\"\r\n              aria-describedby=\"basic-addon-gender\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-name\">Name</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.pilot.name\"\r\n              aria-describedby=\"basic-addon-name\" readonly>\r\n          </div>\r\n        </div>\r\n        <div class=\"col-md-4\">\r\n          <div class=\"input-group\">\r\n            <span class=\"input-group-addon\" id=\"basic-addon-passport\">Passport</span>\r\n            <input type=\"text\" class=\"form-control\" ng-model=\"flightDetail.pilot.passport\"\r\n              aria-describedby=\"basic-addon-passport\" readonly>\r\n          </div>\r\n        </div>\r\n\r\n      </div>\r\n      <div class=\"modal-footer\">\r\n        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n      </div>\r\n    </div>\r\n\r\n  </div>\r\n</div>\r\n\r\n<div class=\"alert alert-info\">\r\n  <h2>Atech Development Challenge Test</h2>\r\n  Here you can see the flight list generated in-memory H2 database by spring boot application.\r\n</div>\r\n\r\n<table class=\"table table-striped\">\r\n    <tr>\r\n        <th>Identification</th>\r\n        <th>Takeoff Time</th>\r\n        <th>Landing Time</th>\r\n        <th>Origin</th>\r\n        <th>Destiny</th>\r\n        <th>Status</th>\r\n        <th>Details</th>\r\n    </tr>\r\n    <tr ng-repeat=\"flight in listFlights\">\r\n        <td>{{flight.id}}</td>\r\n        <td>{{flight.takeoffTime}}</td>\r\n        <td>{{flight.landingTime}}</td>\r\n        <td>{{flight.originCity.name}}</td>\r\n        <td>{{flight.destinyCity.name}}</td>\r\n        <td>{{flight.flightStatus}}</td>\r\n        <th><button type=\"button\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#detail\"\r\n          ng-click=\"setDetailInfo(flight)\">\r\n          Open details</button>\r\n        </th>\r\n    </tr>\r\n</table>\r\n");
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

            $scope.setDetailInfo = function(flight){
                $scope.flightDetail = flight;
            };

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
