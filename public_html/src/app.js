(function () {

    var mainApp = angular.module('mainApp', ['ngRoute', 'hotelModule', 'eventModule','travelerModule', 'transportationModule']);

    mainApp.config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/hotel', {
                templateUrl: 'src/modules/hotel/hotel.tpl.html'
            },
            $routeProvider.when('/event', {templateUrl: 'src/modules/Event/event.tpl.html'})).otherwise('/');
            $routeProvider.when('/traveler', {
                templateUrl: 'src/modules/traveler/traveler.tpl.html'
            }),
                    $routeProvider.when('/transportation', {
                templateUrl: 'src/modules/Transportation/transportation.tpl.html'
            }).otherwise('/');
        }]);

    //Configuración módulo hotel
    var hotelModule = angular.module('hotelModule', ['CrudModule', 'MockModule']);

    hotelModule.constant('hotel.context', 'hotels');

    hotelModule.config(['hotel.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
    //configuración moduloTVSHOW
    var eventModule = angular.module('eventModule', ['CrudModule', 'MockModule']);

    eventModule.constant('event.context', 'event');

    eventModule.config(['event.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);

    //configuración modulo Traveler
    var playerModule = angular.module('travelerModule', ['CrudModule', 'MockModule']);
    playerModule.constant('traveler.context', 'travelers');
    playerModule.config(['traveler.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
    var transportationModule = angular.module('transportationModule', ['CrudModule', 'MockModule']);
    transportationModule.constant('transportation.context', 'travelers');
    transportationModule.config(['transportation.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();