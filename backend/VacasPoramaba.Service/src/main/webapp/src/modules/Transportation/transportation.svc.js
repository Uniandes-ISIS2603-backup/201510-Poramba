(function (angular) {
    var transportationModule = angular.module('transportationModule');
    transportationModule.service('transportationService', ['CRUDBase', 'transportation.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
        }]);
})(window.angular);
