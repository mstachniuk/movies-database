var myApp = angular.module('myApp', []);

myApp.controller('movie', function ($scope, $http) {
    $http.get('movie/').success(function (data) {
        $scope.movies = data;
    });
});
