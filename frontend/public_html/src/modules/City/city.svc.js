(function () {
    var cityModule = angular.module('cityModule', ['CrudModule', 'MockModule','countryModule']);
/*se debe construire otro mock*/
    cityModule.constant('city.context', 'citys');

    cityModule.config(['city.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();