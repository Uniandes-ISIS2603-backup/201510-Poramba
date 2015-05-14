(function (angular) {
    var cityModule = angular.module('cityModule', ['CrudModule', 'MockModule']);
    cityModule.constant('city.context', 'citys');
     cityModule.constant('city.skipMock', false);
    cityModule.config(['city.context', 'MockModule.urlsProvider','city.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);

