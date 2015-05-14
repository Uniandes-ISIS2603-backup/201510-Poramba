(function (angular) {
    var mapModule = angular.module('mapModule', ['CrudModule', 'MockModule']);
    mapModule.constant('map.context', 'maps');
    mapModule.constant('map.skipMock',false );
            mapModule.config(['map.context', 'MockModule.urlsProvider','map.skipMock', function (context, urlsProvider,skipMock) {
            urlsProvider.registerUrl(context,skipMock);
        }]);
})(window.angular);