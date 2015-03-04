(function () {

	var mainApp = angular.module('mainApp', ['ngRoute', 'hotelModule', 'eventModule']);

	mainApp.config(['$routeProvider', function ($routeProvider) {
			$routeProvider.when('/hotel', {
				templateUrl: 'src/modules/hotel/hotel.tpl.html'
			}, $routeProvider.when('/event',{templateUrl:'src/modules/Event/event.tpl.html'})).otherwise('/');
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
})();