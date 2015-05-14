(function () {
	var app = angular.module('itineraryModule',[]);

	app.controller('itineraryCtrl', ['$scope','itineraryService', function ($scope, itineraryService) {
			itineraryService.extendCtrl(this, $scope);
                      	this.fetchRecords();
//                        ciudadService.fetchRecords().then(function(data){
//                            $scope.records = data;
//                            });
//                            
//                        this.fetchRecords();
//                        eventService.fetchRecords().then(function(data){
//                            $scope.records = data;
//                            });    
//                            
//                             this.getCiudadName = function(id){
//                for (var i in $scope.records) {
//                    
//                    if ($scope.records[i].id === id) {
//                        return $scope.records[i].name;
//                    }
//                }
//                return;
//                    };
//            this.getEnventName= function(id){
//                for (var i in $scope.records) {
//                    if ($scope.records[i].id === id) {
//                        return $scope.eventRecords[i].name;
//                    }
//                }
//                return;
//            };
              
		}]);                                  
            
            
})();
