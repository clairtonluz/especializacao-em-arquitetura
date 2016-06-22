angular.module('BrisaImoveis')
    .config(function ($routeProvider) {
        $routeProvider.when('/imoveis', {
            templateUrl: 'templates/pages/imoveis'
        }).when('/usuarios', {
            templateUrl: 'templates/pages/usuarios'
        }).when('/', {
            templateUrl: 'templates/pages/imoveis'
        }).otherwise('/');
    });