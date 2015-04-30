(function () {
    var app = angular.module('cityModule');

	app.controller('cityCtrl', ['$scope', 'CRUDUtils', 'city.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                        
			this.fetchRecords();
                        $scope.showForm = true;
			
		}]);                                  
            
            
})();
