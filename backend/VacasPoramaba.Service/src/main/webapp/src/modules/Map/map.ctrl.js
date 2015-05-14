(function () {
    var app = angular.module('mapModule',[]);
    app.controller('mapCtrl', ['$scope','mapService',function ($scope,mapService) {
            mapService.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();