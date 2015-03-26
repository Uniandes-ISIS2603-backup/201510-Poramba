(function () {
    var itineraryModule = angular.module('itineraryModule', ['CrudModule','itineraryModule']);

    itineraryModule.constant('itinerary.context', 'itineraries');
    itineraryModule.config(['itinerary.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();