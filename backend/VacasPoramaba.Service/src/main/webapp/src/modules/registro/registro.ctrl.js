(function () {
    var app = angular.module('regModule');
    app.controller('regCtrl', ['$scope', 'reg.context', function ($scope, context) {
            this.url = context;
            regService.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();
