(function (angular) {
    var BuscadorModule = angular.module('BuscadorModule');
    BuscadorModule.service('BuscadorService', ['CRUDBase', 'Buscador.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
        }]);
})(window.angular);