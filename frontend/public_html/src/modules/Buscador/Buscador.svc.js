(function () {
    var Buscador = angular.module('Buscador');
    Buscador.service('BuscadorService', ['CRUDBase', 'Buscador.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
        }]);
})();