(function (angular) {
    var travelerModule = angular.module('travelerModule', ['CrudModule', 'MockModule']);
    travelerModule.constant('traveler.context', 'travelers');
    travelerModule.constant('traveler.skipMock', false);
    travelerModule.config(['traveler.context', 'MockModule.urlsProvider','traveler.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);