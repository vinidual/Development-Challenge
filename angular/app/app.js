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
