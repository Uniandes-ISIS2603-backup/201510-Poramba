(function () {
    var itineraryModule = angular.module('itineraryModule');
    eventModule.service('itineraryService', ['CRUDBase', 'itinerary.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
        }]);
})();



