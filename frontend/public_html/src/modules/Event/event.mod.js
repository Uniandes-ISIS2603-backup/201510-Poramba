(function () {
    var eventModule = angular.module('eventModule', ['CrudModule', 'eventModule']);

    eventModule.constant('event.context', 'events');
    eventModule.config(['event.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();