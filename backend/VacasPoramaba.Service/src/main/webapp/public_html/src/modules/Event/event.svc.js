(function () {
    var eventModule = angular.module('eventModule');
    eventModule.service('eventService', ['CRUDBase', 'event.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
        }]);
})();