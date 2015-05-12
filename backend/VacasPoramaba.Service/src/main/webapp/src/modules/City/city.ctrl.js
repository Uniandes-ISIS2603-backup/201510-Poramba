(function (angular) {
    var appCity = angular.module('cityModule');
	appCity.controller('cityCtrl',['$scope','cityService',function ($scope, cityService){
		cityService.extendCtrl(this, $scope); 
                this.fetchRecords();
                
                this.prueba = function()
                {
                    cityService.sirve();
                };
		}]);        
})(window.angular);
