(function () {
    var app = angular.module('BuscascadorModule');
    app.controller('BuscascadorCtrl', ['$scope', 'CRUDUtils', 'Buscascador.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();