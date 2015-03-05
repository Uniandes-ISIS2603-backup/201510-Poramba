(function () {
	var crud = angular.module('CrudModule');

	crud.factory('CRUDUtils', ['Restangular', function (RestAngular) {
			function CRUD($scope) {
				this.api = RestAngular.all(this.url);
				$scope.currentRecord = {};
				$scope.records = [];
				this.editMode = false;

				this.fetchRecords = function () {
					var self = this;
					this.api.getList().then(function (data) {
						$scope.records = data;
						$scope.currentRecord = {};
						self.editMode = false;
					});
				};
                                this.mostviewRecords = function(record){
                                    var self = this;
                             
                                        alert('The Tv Show with the highest rating is: ' + record.name);

                                
                            };
                            
                            this.inicializarNombre = function(){
                                $scope.currentRecord.name = 'Pestana casino park';
                            };
                             this.inicializarUbicacion = function(){
                                $scope.currentRecord.ubicacionHot = 'Isla de madeira';
                            };
                              this.inicializarDescripcion = function(){
                                $scope.currentRecord.descripcion = 'EL PESTANA CASINO PARK FORMA PARTE DEL COMPLEJO TURÍSTICO MÁS EMBLEMÁTICO DE LA ISLA DE MADEIRA.';
                            };
                              this.inicializarUrl = function(){
                                $scope.currentRecord.link = 'http://www.pestana.com/es/pestana-casino-park-hotel/pages/home.aspx';
                            };
				this.createRecord = function () {
					this.editMode = true;
					$scope.currentRecord = {};
                                        
				};
				this.saveRecord = function () {
					var self = this;
					if ($scope.currentRecord.id) {
						$scope.currentRecord.put().then(function () {
							self.fetchRecords();
						});
					} else {
						this.api.post($scope.currentRecord).then(function () {
							self.fetchRecords();
						});
					}
				};
				this.deleteRecord = function (record) {
					var self = this;
					record.remove().then(function () {
						self.fetchRecords();
					});
				};
				this.editRecord = function (record) {
					$scope.currentRecord = RestAngular.copy(record);
					this.editMode = true;
				};
			}
			;
			return {
				extendCtrl: function (obj, scope) {
					CRUD.call(obj, scope);
				}
			};
		}]);
})();