'use strict';

angular.module('agenda',['ngRoute','ngResource'])
  .config(['$routeProvider', function($routeProvider) {
    $routeProvider
      .when('/',{templateUrl:'views/landing.html',controller:'LandingPageController'})
      .when('/Contatos',{templateUrl:'views/Contato/search.html',controller:'SearchContatoController'})
      .when('/Contatos/new',{templateUrl:'views/Contato/detail.html',controller:'NewContatoController'})
      .when('/Contatos/edit/:ContatoId',{templateUrl:'views/Contato/detail.html',controller:'EditContatoController'})
      .when('/Pessoas',{templateUrl:'views/Pessoa/search.html',controller:'SearchPessoaController'})
      .when('/Pessoas/new',{templateUrl:'views/Pessoa/detail.html',controller:'NewPessoaController'})
      .when('/Pessoas/edit/:PessoaId',{templateUrl:'views/Pessoa/detail.html',controller:'EditPessoaController'})
      .when('/Telefones',{templateUrl:'views/Telefone/search.html',controller:'SearchTelefoneController'})
      .when('/Telefones/new',{templateUrl:'views/Telefone/detail.html',controller:'NewTelefoneController'})
      .when('/Telefones/edit/:TelefoneId',{templateUrl:'views/Telefone/detail.html',controller:'EditTelefoneController'})
      .otherwise({
        redirectTo: '/'
      });
  }])
  .controller('LandingPageController', function LandingPageController() {
  })
  .controller('NavController', function NavController($scope, $location) {
    $scope.matchesRoute = function(route) {
        var path = $location.path();
        return (path === ("/" + route) || path.indexOf("/" + route + "/") == 0);
    };
  });
