(function (angular) {
    var cityModule = angular.module('cityModule');
    
    cityModule.service('cityService', ['CRUDBase', 'city.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
            this.sirve = function()
            {
                return this.api.customGet('/city/conectado');
            };
        }]);
})(window.angular);