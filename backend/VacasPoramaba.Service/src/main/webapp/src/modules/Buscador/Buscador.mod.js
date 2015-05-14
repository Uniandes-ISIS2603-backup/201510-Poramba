(function (angular) {
    var Buscador = angular.module('BuscadorModule', ['CrudModule', 'MockModule']);
    Buscador.constant('Buscador.context', 'Buscadors');
    Buscador.constant('Buscador.skipMock', false);
    Buscador.config(['Buscador.context', 'MockModule.urlsProvider','Buscador.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);