
(function () {
	var app = angular.module('hotelModule');

	app.controller('hotelCtrl', ['$scope', 'CRUDUtils', 'hotel.context', '$location', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                        
			this.fetchRecords();
                        
                        
                        this.ana = function()
                        {
                           // <---- $location.path('/event').replace();-->
                            alert ('anama');
                        };
		}]);           
            
            
            
            
})();
