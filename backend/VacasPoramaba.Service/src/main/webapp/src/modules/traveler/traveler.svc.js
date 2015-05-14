(function (angular) {
    var travelerModule = angular.module('travelerModule');
    travelerModule.service('travelerService', ['CRUDBase', 'traveler.context', function (CRUDBase, context) {
              this.url = context;
            CRUDBase.extendService(this);
        }]);
})(window.angular);
