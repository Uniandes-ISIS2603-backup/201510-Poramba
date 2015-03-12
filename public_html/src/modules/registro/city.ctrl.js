(function () {
    var app = angular.module('cityModulfe');
    app.controller('cityCtrl', ['$scope', 'CRUDUtils', 'city.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);


})();
