(function (angular) {
    var countryModule = angular.module('cityModule');

    countryModule.run(['$httpBackend', 'city.context', 'MockModule.mockRecords', 'city.skipMock', 'MockModule.baseUrl', function ($httpBackend, context, mockRecords, skipMock, baseUrl) {
            if (skipMock) {
                $httpBackend.whenGET(baseUrl + '/' + context + '/city/conectado').passThrough();
            } else {
            }
        }]);
})(window.angular);
