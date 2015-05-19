(function () {
	var app = angular.module('itineraryModule',[]);

	app.controller('itineraryCtrl', ['$scope','itineraryService', function ($scope, itineraryService) {
			itineraryService.extendCtrl(this, $scope);
                      	this.fetchRecords();
		}]);                                  
            
            
})();
