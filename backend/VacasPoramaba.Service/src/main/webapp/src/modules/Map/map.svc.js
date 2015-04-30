(function () {
    var mapModule = angular.module('mapModule');
    mapModule.service('mapService', ['CRUDBase', 'map.context', function (CRUDBase, context) {
            this.url = context;
            CRUDBase.extendService(this);
        }]);
})();