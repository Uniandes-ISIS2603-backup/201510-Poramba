(function () {
    var transportationModule = angular.module('transportationModule', ['CrudModule', 'MockModule','countryModule']);
/*se debe construire otro mock*/
    transportationModule.constant('transportation.context', 'transportations');

    transportationModule.config(['transportation.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();