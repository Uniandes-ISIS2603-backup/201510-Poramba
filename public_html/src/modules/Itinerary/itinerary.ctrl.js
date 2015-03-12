(function () {
	var app = angular.module('itineraryModule');

	app.controller('itineraryCtrl', ['$scope', 'CRUDUtils','ciudad.context', 'itineraryService','eventService', function ($scope, CRUDUtils, context,eventService,ciudadService) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                      
			this.fetchRecords();
                        ciudadService.fetchRecords().then(function(data){
                            $scope.ciudadRecords = data;
                            });
                            
                        this.fetchRecords();
                        eventService.fetchRecords().then(function(data){
                            $scope.eventRecords = data;
                            });    
                            
                             this.getCiudadName = function(id){
                for (var i in $scope.ciudadRecords) {
                    
                    if ($scope.ciudadRecords[i].id === id) {
                        return $scope.ciudadRecords[i].name;
                    }
                }
                return;
                    };
            this.getEnventName= function(id){
                for (var i in $scope.eventRecords) {
                    if ($scope.eventRecords[i].id === id) {
                        return $scope.eventRecords[i].name;
                    }
                }
                return;
            };
              
		}]);                                  
            
            
})();
