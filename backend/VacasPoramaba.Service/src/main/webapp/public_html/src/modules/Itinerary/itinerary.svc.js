(function () {
    var itineraryModule = angular.module('itineraryModule');
    itineraryModule.service('itineraryService', ['CRUDBase', 'itinerary.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
        }]);
})();



