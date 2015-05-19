(function (angular) {
    var appCity = angular.module('cityModule',[]);
	appCity.controller('cityCtrl',['$scope','cityService',function ($scope, cityService){
		cityService.extendCtrl(this, $scope); 
                this.fetchRecords();
                
               this.sirve = function(){
                    cityService.sirve().then(function(){
                    alert('There are no countries with population on server');

                    });
               };
		}]);        
})(window.angular);
