(function () {
    var Buscador = angular.module('BuscadorModule', ['CrudModule', 'BuscadorModule']);

    Buscador.constant('Buscador.context', 'Buscadors');
    Buscador.config(['Buscador.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();