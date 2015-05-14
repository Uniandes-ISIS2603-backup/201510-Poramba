(function () {
	var app = angular.module('transportationModule',[]);
	app.controller('transportationCtrl', ['$scope', 'transportationService', function ($scope, transportationService) {
			transportationService.extendCtrl(this, $scope);
			this.fetchRecords();
		}]);    
})();
