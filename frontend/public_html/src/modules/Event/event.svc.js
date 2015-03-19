(function () {
    var eventModule = angular.module('eventModule', ['CrudModule', 'MockModule','countryModule']);
/*se debe construire otro mock*/
    eventModule.constant('event.context', 'events');

    eventModule.config(['event.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();