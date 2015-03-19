(function () {
    var app = angular.module('travelerModule');
    app.controller('travelerCtrl', ['$scope', 'CRUDUtils', 'traveler.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();