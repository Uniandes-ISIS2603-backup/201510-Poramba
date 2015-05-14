(function (angular) {
	var app = angular.module('eventModule');
	app.controller('eventCtrl', ['$scope', 'eventService', function ($scope, eventService) {
			eventService.extendCtrl(this, $scope);
			this.fetchRecords();
		}]); 
})(window.angular);