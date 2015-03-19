(function () {
	var app = angular.module('transportationModule');

	app.controller('transportationCtrl', ['$scope', 'CRUDUtils', 'transportation.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                        
			this.fetchRecords();
		}]);                                  
            
            
})();
