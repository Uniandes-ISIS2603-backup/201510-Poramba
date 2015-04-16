(function () {
    var crud = angular.module('CrudModule');

    crud.factory('CRUDUtils', ['Restangular', function (RestAngular) {
            function CRUD($scope) {
                this.api = RestAngular.all(this.url);
                $scope.currentRecord = {};
                $scope.records = [];
                this.editMode = false;
                this.darOpinion = false;
                this.darRecords = true;
                this.fetchRecords = function () {
                    var self = this;
                    this.api.getList().then(function (data) {
                        $scope.records = data;
                        $scope.currentRecord = {};
                        self.editMode = false;
                        self.darOpinion = false;
                        self.darRecords = true;
                    });
                };
                this.mostviewRecords = function (record) {
                    var self = this;
                    alert('The Tv Show with the highest rating is: ' + record.name);
                };
                this.createRecord = function () {
                    this.editMode = true;
                    this.darRecords = false;
                    $scope.currentRecord = {};

                };
                this.saveRecord = function () {
                    var self = this;
                    if ($scope.currentRecord.id) {
                        $scope.currentRecord.put().then(function () {
                            self.fetchRecords();
                        });
                    } else {
                        this.api.post($scope.currentRecord).then(function () {
                            self.fetchRecords();
                        });
                    }
                };
                this.deleteRecord = function (record) {
                    var self = this;
                    record.remove().then(function () {
                        self.fetchRecords();
                    });
                };
                this.editRecord = function (record) {
                    $scope.currentRecord = RestAngular.copy(record);
                    this.editMode = true;
                    this.darRecords = false;
                };
                
                this.darOpinion = function (record) {
                    $scope.currentRecord = RestAngular.copy(record);
                    this.darOpinion = true;
                    this.darRecords = false;
                };
            }
            ;
            return {
                extendCtrl: function (obj, scope) {
                    CRUD.call(obj, scope);
                }
            };
        }]);
})();
