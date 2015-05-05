(function (angular) {
    var eventModule = angular.module('eventModule', ['CrudModule', 'eventModule']);
    eventModule.constant('event.context', 'events');
    eventModule.constant('event.skipMock', false);
    eventModule.config(['event.context', 'MockModule.urlsProvider', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);