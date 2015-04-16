(function () {
    var Buscador = angular.module('BuscadorModule', ['CrudModule', 'Buscador']);

    Buscador.constant('Buscador.context', 'Buscadores');
    Buscador.config(['Buscador.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();