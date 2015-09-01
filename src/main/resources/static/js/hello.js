angular.module('hello', [])
    .controller('home', function ($scope, $http) {
        $http.get('info/').success(function (data) {
            $scope.info = data;
        });

        $http.get('user/').success(function (data) {
            $scope.users = data;
        });

        $scope.createExampleUsers = function () {
            $http.post("user/").success(function (data) {
                $http.get('user/').success(function (data) {
                    $scope.users = data;
                });
            });
        }

        $scope.deleteAllUsers = function () {
            $http.delete("user/").success(function (data) {
                $http.get('user/').success(function (data) {
                    $scope.users = data;
                });
            });
        }
    });
