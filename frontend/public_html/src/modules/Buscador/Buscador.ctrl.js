(function () {
    var app = angular.module('BuscadorModule');
    app.controller('BuscadorCtrl', ['$scope', 'CRUDUtils', 'Buscador.context', function ($scope, CRUDUtils, context) {
            this.url = context;
            CRUDUtils.extendCtrl(this, $scope);
            this.fetchRecords();
        }]);
})();