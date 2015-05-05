(function () {
    var travelerModule = angular.module('travelerModule', ['CrudModule', 'travelerModule']);
    travelerModule.constant('traveler.context', 'travelers');
    travelerModule.config(['traveler.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();