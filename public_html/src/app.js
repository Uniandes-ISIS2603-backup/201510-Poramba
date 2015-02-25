(function () {

	var mainApp = angular.module('mainApp', ['ngRoute', 'sportModule','tvShowModule']);

	mainApp.config(['$routeProvider', function ($routeProvider) {
			$routeProvider.when('/sport', {
				templateUrl: 'src/modules/sport/sport.tpl.html'
			}, $routeProvider.when('/tvShow',{templateUrl:'src/modules/tvShow/tvShow.tpl.html'})).otherwise('/');
		}]);

	//Configuración módulo sport
	var sportModule = angular.module('sportModule', ['CrudModule', 'MockModule']);

	sportModule.constant('sport.context', 'sports');

	sportModule.config(['sport.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
            //configuración moduloTVSHOW
         var tvShowModule = angular.module('tvShowModule', ['CrudModule', 'MockModule']);

	tvShowModule.constant('tvShow.context', 'tvShow');

	tvShowModule.config(['tvShow.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
			urlsProvider.registerUrl(context);
		}]);
})();