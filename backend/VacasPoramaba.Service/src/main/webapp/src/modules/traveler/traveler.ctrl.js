(function () {
    var app = angular.module('travelerModule',[]);
    app.controller('travelerCtrl', ['$scope','travelerService', function ($scope, travelerService) {
            travelerService.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();