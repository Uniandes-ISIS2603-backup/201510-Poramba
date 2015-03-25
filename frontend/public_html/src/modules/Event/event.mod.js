(function () {
    var eventModule = angular.module('eventModule', ['CrudModule','eventModule']);

    eventModule.constant('event.context', 'events');
})();