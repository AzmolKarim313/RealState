angular.module('homeApp', [])
        .controller('homeCrtl', function ($scope) {
            $scope.homes = [];
            $scope.homeView = {
                id: -1,
                location: "",
                sublocation: "",
                platsize: -1,
                price: -1,
                room: -1,
                hiredate: ""
            };

            _refreshHomeData();

            $scope.submitHome = function () {

                var method = "";
                var url = "";
                if ($scope.homeView.id == -1) {
                    method = "POST";
                    url = 'rest/homes';
                } else {
                    method = "PUT";
                    url = 'rest/homes/' + $scope.homeView.id;
                }

                $http({
                    method: method,
                    url: url,
                    data: angular.toJson($scope.homeView),
                    headers: {
                        'Content-Type': 'application/json'
                    }
                }).then(_success, _error);
            };

            //HTTP DELETE- delete Message by Id
            $scope.deleteHome = function (home) {
                $http({
                    method: 'DELETE',
                    url: 'rest/homes/' + home.id
                }).then(_success, _error);
            };

            $scope.updateHome = function (home) {
                $scope.homeView.id = home.id,
                        $scope.homeView.location = home.location,
                        $scope.homeView.sublocation = home.sublocation,
                        $scope.homeView.platsize = home.platsize,
                        $scope.homeView.price = home.price,
                        $scope.homeView.room = home.room,
                        $scope.homeView.hiredate = home.hiredate
            };

            function _refreshSimpleData() {
                $http({
                    method: 'GET',
                    url: 'http://localhost:8084/HomeSaleApp/rest/homes'
                }).then(function successCallback(response) {
                    $scope.homes = response.data;
                    console.log(response.data);
                }, function errorCallback(response) {
                    console.log(response.statusText);
                });
            }

            function _success(response) {
                _refreshSimpleData();
                _clearFormData()
            }

            function _error(response) {
                console.log(response.statusText);
            }


            function _clearFormData() {
                $scope.homeView.id = -1,
                        $scope.homeView.location = "",
                        $scope.homeView.sublocation = "",
                        $scope.homeView.platsize = -1,
                        $scope.homeView.price = -1,
                        $scope.homeView.room = -1,
                        $scope.homeView.hiredate = ""
            }
            ;
        })
        ;