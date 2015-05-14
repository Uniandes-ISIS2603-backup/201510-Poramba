(function () {

    var mainApp = angular.module('mainApp', ['ngRoute','hotelModule','eventModule','travelerModule','transportationModule','itineraryModule','cityModule','mapModule','BuscadorModule']);

    mainApp.config(['$routeProvider', function ($routeProvider) {
            $routeProvider.when('/hotel', {
                templateUrl: 'src/modules/Hotel/hotel.tpl.html'            },
            $routeProvider.when('/event', {templateUrl: 'src/modules/Event/event.tpl.html'})).otherwise('/');
            $routeProvider.when('/traveler', {
                templateUrl: 'src/modules/traveler/traveler.tpl.html'
            }).when('/transportation', {
                templateUrl: 'src/modules/Transportation/transportation.tpl.html'
            }).when('/itinerary', {
                templateUrl: 'src/modules/Itinerary/itinerary.tpl.html'
            }).when('/city', {
                templateUrl: 'src/modules/City/city.tpl.html'
            }).when('/map', {
                templateUrl: 'src/modules/Map/map.tpl.html'
            }).when('/Buscador',{
                templateUrl: 'src/modules/Buscador/Buscador.tpl.html'                
            }).when('/registro', {
                templateUrl: 'src/modules/registro/registro.tpl.html'
            }).otherwise('/');
        }]);
})();
