(function () {
    var hotelModule = angular.module('hotelModule', ['CrudModule','hotelModule']);

    hotelModule.constant('hotel.context', 'hotels');
})();
