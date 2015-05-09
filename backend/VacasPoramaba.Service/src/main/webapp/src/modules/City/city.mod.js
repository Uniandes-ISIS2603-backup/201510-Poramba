(function (angular) {
    var cityModule = angular.module('cityModule', ['CrudModule', 'cityModule']);
    cityModule.constant('city.context', 'cities');
     cityModule.constant('city.skipMock', true);
    cityModule.config(['city.context', 'MockModule.urlsProvider', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);

