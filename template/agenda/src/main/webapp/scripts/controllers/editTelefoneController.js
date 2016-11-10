

angular.module('agenda').controller('EditTelefoneController', function($scope, $routeParams, $location, flash, TelefoneResource ) {
    var self = this;
    $scope.disabled = false;
    $scope.$location = $location;
    
    $scope.get = function() {
        var successCallback = function(data){
            self.original = data;
            $scope.telefone = new TelefoneResource(self.original);
        };
        var errorCallback = function() {
            flash.setMessage({'type': 'error', 'text': 'The telefone could not be found.'});
            $location.path("/Telefones");
        };
        TelefoneResource.get({TelefoneId:$routeParams.TelefoneId}, successCallback, errorCallback);
    };

    $scope.isClean = function() {
        return angular.equals(self.original, $scope.telefone);
    };

    $scope.save = function() {
        var successCallback = function(){
            flash.setMessage({'type':'success','text':'The telefone was updated successfully.'}, true);
            $scope.get();
        };
        var errorCallback = function(response) {
            if(response && response.data && response.data.message) {
                flash.setMessage({'type': 'error', 'text': response.data.message}, true);
            } else {
                flash.setMessage({'type': 'error', 'text': 'Something broke. Retry, or cancel and start afresh.'}, true);
            }
        };
        $scope.telefone.$update(successCallback, errorCallback);
    };

    $scope.cancel = function() {
        $location.path("/Telefones");
    };

    $scope.remove = function() {
        var successCallback = function() {
            flash.setMessage({'type': 'error', 'text': 'The telefone was deleted.'});
            $location.path("/Telefones");
        };
        var errorCallback = function(response) {
            if(response && response.data && response.data.message) {
                flash.setMessage({'type': 'error', 'text': response.data.message}, true);
            } else {
                flash.setMessage({'type': 'error', 'text': 'Something broke. Retry, or cancel and start afresh.'}, true);
            }
        }; 
        $scope.telefone.$remove(successCallback, errorCallback);
    };
    
    $scope.tipoList = [
        "CELULAR",  
        "COMERCIAL",  
        "RESIDENCIAL"  
    ];
    
    $scope.get();
});