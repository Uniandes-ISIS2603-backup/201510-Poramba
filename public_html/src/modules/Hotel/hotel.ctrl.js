(function () {
	var app = angular.module('hotelModule');

	app.controller('hotelCtrl', ['$scope', 'CRUDUtils', 'hotel.context', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                        
			this.fetchRecords();
		}]);           
            this.nuevaj = function()
            {
                window.location.replace("http://www.mydomain.com/new-page.html");
            };
            
            
            
})();