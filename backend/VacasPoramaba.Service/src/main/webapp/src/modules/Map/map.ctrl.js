(function () {
    var app = angular.module('mapModule');
    app.controller('mapCtrl', ['$scope', 'CRUDUtils', 'map.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();