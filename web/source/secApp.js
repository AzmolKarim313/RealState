angular.module('testApp', [])
        .controller('testCtrl', function ($scope) {
            $scope.abc = "asd";
            $scope.homes = [
                {
                    "location": "Dhaka",
                    "sublocation": "Mirpur-14",
                    "platsize": "1500",
                    "room": "2",
                    "price": "2500000",
                    "hiredate": "20/02/2015"
                },
                {
                    "location": "Dhaka",
                    "sublocation": "Dhanmondi",
                    "platsize": "2500",
                    "room": "4",
                    "price": "5000000",
                    "hiredate": "02/10/2016"
                },
                {
                    "location": "Dhaka",
                    "sublocation": "Mirpur-01",
                    "platsize": "1780",
                    "room": "3",
                    "price": "3500000",
                    "hiredate": "01/02/2016"
                },
                {
                    "location": "Dhaka",
                    "sublocation": "Cantonment",
                    "platsize": "1200",
                    "room": "2",
                    "price": "2000000",
                    "hiredate": "02/02/2015"
                },
                {
                    "location": "Dhaka",
                    "sublocation": "Shavar",
                    "platsize": "3000",
                    "room": "6",
                    "price": "5500000",
                    "hiredate": "01/12/2016"
                },
                {
                    "location": "Dhaka",
                    "sublocation": "Chereakhana",
                    "platsize": "1000",
                    "room": "2",
                    "price": "1500000",
                    "hiredate": "02/07/2015"
                },
                {
                    "location": "Jessore",
                    "sublocation": "Local",
                    "platsize": "2500",
                    "room": "4",
                    "price": "1000000",
                    "hiredate": "02/02/2015"
                }
            ]
        });