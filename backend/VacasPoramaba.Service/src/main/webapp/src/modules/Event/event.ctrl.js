(function (angular) {
	var app = angular.module('eventModule');

	app.controller('eventCtrl', ['$scope', 'CRUDUtils', 'event.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                        
			this.fetchRecords();
		}]);                                  
            
            
})(window.angular);