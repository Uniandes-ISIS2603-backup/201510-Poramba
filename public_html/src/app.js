(function () {

    var mainApp = angular.module('mainApp', ['ngRoute', 'hotelModule', 'eventModule','travelerModule', 'transportationModule','itineraryModule','cityModule']);

    mainApp.config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/hotel', {
                templateUrl: 'src/modules/hotel/hotel.tpl.html'
            },
            $routeProvider.when('/event', {templateUrl: 'src/modules/Event/event.tpl.html'})).otherwise('/');
            $routeProvider.when('/traveler', {
                templateUrl: 'src/modules/traveler/traveler.tpl.html'
            }).otherwise('/');
            $routeProvider.when('/transportation', {
                templateUrl: 'src/modules/Transportation/transportation.tpl.html'
            }).otherwise('/'); 
            $routeProvider.when('/itinerary', {
                templateUrl: 'src/modules/Itinerary/itinerary.tpl.html'
            }).otherwise('/');
            $routeProvider.when('/city', {
                templateUrl: 'src/modules/City/city.tpl.html'
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
    
    //configuración modulo Transportation
    var transportationModule = angular.module('transportationModule', ['CrudModule', 'MockModule']);
    transportationModule.constant('transportation.context', 'transportations');
    transportationModule.config(['transportation.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
    
    //configuración modulo Itinerary
    var itineraryModule = angular.module('itineraryModule', ['CrudModule', 'MockModule']);
    itineraryModule.constant('itinerary.context', 'itinerarys');
    itineraryModule.config(['itinerary.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
    
        //configuración modulo City
    var cityModule = angular.module('cityModule', ['CrudModule', 'MockModule']);
    cityModule.constant('city.context', 'citys');
    cityModule.config(['city.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();
