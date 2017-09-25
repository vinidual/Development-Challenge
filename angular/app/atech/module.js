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
