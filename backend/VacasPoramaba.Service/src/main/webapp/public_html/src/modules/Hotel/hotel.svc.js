(function(){
    var hotelModule = angular.module('hotelModule');  
    hotelModule.service('hotelService', ['CRUDBase','hotel.context', function(CRUDBase, context){
            this.url = context;
            CRUDBase.extendService(this);
    }]);
})();

