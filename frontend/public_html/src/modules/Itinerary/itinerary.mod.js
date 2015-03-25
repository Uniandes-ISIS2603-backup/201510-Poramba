(function () {
    var itineraryModule = angular.module('itineraryModule', ['CrudModule','itineraryModule']);

    itineraryModule.constant('itinerary.context', 'itinerarys');
})();