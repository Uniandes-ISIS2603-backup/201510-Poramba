(function (angular) {
    var cityModule = angular.module('regModule', ['CrudModule', 'MockModule']);
    cityModule.constant('reg.context', 'registro');
     cityModule.constant('reg.skipMock', false);
    cityModule.config(['reg.context', 'MockModule.urlsProvider','reg.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);