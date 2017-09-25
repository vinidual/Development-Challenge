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
