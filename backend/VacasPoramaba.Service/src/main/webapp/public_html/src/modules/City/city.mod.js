(function () {
    var cityModule = angular.module('cityModule', ['CrudModule', 'cityModule']);

    cityModule.constant('city.context', 'cities');
    cityModule.config(['city.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();