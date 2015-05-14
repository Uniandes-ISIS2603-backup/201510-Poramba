(function (angular) {
    var transportationModule = angular.module('transportationModule', ['CrudModule', 'MockModule']);
    transportationModule.constant('transportation.context', 'transportations');
    transportationModule.constant('transportationModule.skipMock', false);
    transportationModule.config(['transportation.context', 'MockModule.urlsProvider','transportationModule.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);