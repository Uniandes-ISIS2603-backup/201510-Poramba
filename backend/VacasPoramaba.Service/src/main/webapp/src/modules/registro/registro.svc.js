(function (angular) {
    var regModule = angular.module('regModule');
    
    regModule.service('regService', ['CRUDBase', 'reg.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
           
        }]);
})(window.angular);