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
