
(function () {
    var transportationModule = angular.module('transportationModule', ['CrudModule', 'transportationModule']);

    transportationModule.constant('transportation.context', 'transportations');
    transportationModule.config(['transportation.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();