(function () {
    var BuscascadorModule = angular.module('BuscascadorModule');
    BuscascadorModule.service('BuscascadorService', ['CRUDBase', 'Buscascador.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
        }]);
})();