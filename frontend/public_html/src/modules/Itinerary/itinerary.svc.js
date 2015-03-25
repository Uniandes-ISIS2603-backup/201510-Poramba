(function () {
    var itineraryModuleInt = angular.module('eventModuleInt', ['CrudModule', 'MockModule','eventModuleInt']);
/*se debe construire otro mock*/
    itineraryModule.constant('itinerary.context', 'itinerarys');

    itineraryModule.config(['event.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();



