(function () {
    var BuscascadorModule = angular.module('BuscascadorModule', ['CrudModule', 'BuscascadorModule']);

    BuscascadorModule.constant('Buscascador.context', 'Buscascadores');
    BuscascadorModule.config(['Buscascador.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();