(function () {
    var eventModuleInt = angular.module('eventModuleInt', ['CrudModule', 'MockModule','eventModuleInt']);
/*se debe construire otro mock*/
    eventModule.constant('event.context', 'events');

    eventModule.config(['event.context', 'MockModule.urlsProvider', function (context, urlsProvider) {
            urlsProvider.registerUrl(context);
        }]);
})();



