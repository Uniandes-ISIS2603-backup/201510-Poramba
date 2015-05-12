(function (angular) {
    var countryModule = angular.module('cityModule');

    countryModule.run(['$httpBackend', 'city.context', 'MockModule.mockRecords', 'city.skipMock', 'MockModule.baseUrl', function ($httpBackend, context, mockRecords, skipMock, baseUrl) {
            if (skipMock) {
                $httpBackend.whenGET(baseUrl + '/' + context + '/city/conectado').passThrough();
                $httpBackend.whenGET(baseUrl + '/' + context + '/lea').passThrough();
            } else {
//                $httpBackend.whenGET(baseUrl + '/' + context + '/mostPopulated').respond(function () {
//                    var top;
//                    var collection = mockRecords[context];
//                    for (var i in collection) {
//                        if (!top && collection[i].population) {
//                            top = collection[i];
//                        } else {
//                            if (collection[i].population && top.population < collection[i].population) {
//                                top = collection[i];
//                            }
//                        }
//                    }
//                    if (!!top) {
//                        return [200, top, {}];
//                    } else {
//                        return [404, {}, {}];
//                    }
//                });
//
//                $httpBackend.whenGET(baseUrl + '/' + context + '/leastPopulated').respond(function () {
//                    var top;
//                    var collection = mockRecords[context];
//                    for (var i in collection) {
//                        if (!top && collection[i].population) {
//                            top = collection[i];
//                        } else {
//                            if (collection[i].population && top.population > collection[i].population) {
//                                top = collection[i];
//                            }
//                        }
//                    }
//                    if (!!top) {
//                        return [200, top, {}];
//                    } else {
//                        return [404, {}, {}];
//                    }
//                });
            }
        }]);
})(window.angular);