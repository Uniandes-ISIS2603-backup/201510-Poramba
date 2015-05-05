(function (angular) {
	var app = angular.module('hotelModule');
	app.controller('hotelCtrl', ['$scope', 'CRUDUtils', 'hotel.context', '$location', function ($scope, CRUDUtils, context) {
			this.url = context;
			CRUDUtils.extendCtrl(this, $scope);
			//this.fetchRecords();
                        //{
                        //};
                         this.inicializarNombre = function(){
                                $scope.currentRecord.name = 'Pestana casino park';
                            };
                               this.inicializarUbicacion = function(){
                                $scope.currentRecord.ubicacionHot = 'Isla de madeira';
                            };
                              this.inicializarDescripcion = function(){
                                $scope.currentRecord.descripcion = 'EL PESTANA CASINO PARK FORMA PARTE DEL COMPLEJO TURÃ?STICO MÃ?S EMBLEMÃ?TICO DE LA ISLA DE MADEIRA.';
                            };
                              this.inicializarUrl = function(){
                                $scope.currentRecord.link = 'http://www.pestana.com/es/pestana-casino-park-hotel/pages/home.aspx';
                            };
		}]); 
})(window.angular);
