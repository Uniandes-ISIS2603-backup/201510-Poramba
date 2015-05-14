(function (angular) {
    var cityModule = angular.module('cityModule');
    
    cityModule.service('cityService', ['CRUDBase', 'city.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
            this.sirve = function()
            {
//                alert   alerta ('yuf')
                return this.api.customGET('/city/conectado');
            };
        }]);
})(window.angular);