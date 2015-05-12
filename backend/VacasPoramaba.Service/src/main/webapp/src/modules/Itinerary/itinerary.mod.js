(function (angular) {
    var itineraryModule = angular.module('itineraryModule', ['CrudModule','itineraryModule']);

    itineraryModule.constant('itinerary.context', 'itineraries');    
    itineraryModule.constant('itinerary.skipMock', false);    
    itineraryModule.config(['itinerary.context', 'MockModule.urlsProvider','itinerary.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);