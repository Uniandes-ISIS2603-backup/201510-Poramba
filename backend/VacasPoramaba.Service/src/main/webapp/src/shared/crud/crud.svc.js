(function () {
    var crud = angular.module('CrudModule');

    crud.factory('CRUDUtils', ['Restangular', function (RestAngular) {
            function CRUD($scope) {
                
                
                $scope.currentRecord = {};
                $scope.records = [];
                
                
                this.editMode = false;
                this.darOpini = false;
                this.darRecords = true;
                
                var self = this;
                this.api = RestAngular.all(this.url);
               
                
                this.createRecord = function () {
                    this.editMode = true;
                    this.darRecords = false;
                    this.darOpini = false;
                    $scope.currentRecord = {};

                };
                
                this.editRecord = function (record) {
                    $scope.currentRecord = RestAngular.copy(record);
                    this.editMode = true;
                    this.darRecords = false;
                    this.darOpini = false;
                };
                
                this.darOpinion = function (record) {
                    $scope.currentRecord = RestAngular.copy(record);
                    this.darOpini = true;
                    this.darRecords = false;
                    this.editMode = false;
                };
                
                this.fetchRecords = function () {
                    this.api.getList().then(function (data) {
                        $scope.records = data;
                        $scope.currentRecord = {};
                        self.editMode = false;
                        self.darOpini = false;
                        self.darRecords = true;
                    });
                };
     
                this.saveRecord = function () {
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
                    record.remove().then(function () {
                        self.fetchRecords();
                    });
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