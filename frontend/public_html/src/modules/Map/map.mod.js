(function () {
    var mapModule = angular.module('mapModule', ['CrudModule', 'mapModule']);

    mapModule.constant('map.context', 'maps');
    mapModule.config(['map.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();