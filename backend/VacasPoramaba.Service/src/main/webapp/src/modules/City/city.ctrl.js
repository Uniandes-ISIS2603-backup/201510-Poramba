(function (angular) {
    var appCity = angular.module('cityModule',[]);
	appCity.controller('cityCtrl',['$scope','cityService',function ($scope, cityService){
		cityService.extendCtrl(this, $scope); 
                this.fetchRecords();
               
		}]);        
})(window.angular);
