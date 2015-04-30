(function () {
    var hotelModule = angular.module('hotelModule', ['CrudModule','hotelModule']);

    hotelModule.constant('hotel.context', 'hotels');
    hotelModule.config(['hotel.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();
