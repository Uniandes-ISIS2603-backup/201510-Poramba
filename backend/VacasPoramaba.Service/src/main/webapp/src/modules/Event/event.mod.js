(function (angular) {
    var eventModule = angular.module('eventModule', ['CrudModule', 'MockModule']);
    eventModule.constant('event.context', 'events');
    eventModule.constant('event.skipMock', false);
    eventModule.config(['event.context', 'MockModule.urlsProvider','event.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);