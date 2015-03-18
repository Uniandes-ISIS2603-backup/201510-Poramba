(function () {
	var app = angular.module('itineraryModule');

	app.controller('itineraryCtrl', ['$scope', 'CRUDUtils','ciudad.context', 'itineraryService','eventService', function ($scope, CRUDUtils, context,eventService,ciudadService) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
                      
			this.fetchRecords();
                        ciudadService.fetchRecords().then(function(data){
                            $scope.records = data;
                            });
                            
                        this.fetchRecords();
                        eventService.fetchRecords().then(function(data){
                            $scope.records = data;
                            });    
                            
                             this.getCiudadName = function(id){
                for (var i in $scope.records) {
                    
                    if ($scope.records[i].id === id) {
                        return $scope.records[i].name;
                    }
                }
                return;
                    };
            this.getEnventName= function(id){
                for (var i in $scope.records) {
                    if ($scope.records[i].id === id) {
                        return $scope.eventRecords[i].name;
                    }
                }
                return;
            };
              
		}]);                                  
            
            
})();
