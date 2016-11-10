
angular.module('agenda').controller('NewTelefoneController', function ($scope, $location, locationParser, flash, TelefoneResource ) {
    $scope.disabled = false;
    $scope.$location = $location;
    $scope.telefone = $scope.telefone || {};
    
    $scope.tipoList = [
        "CELULAR",
        "COMERCIAL",
        "RESIDENCIAL"
    ];
    

    $scope.save = function() {
        var successCallback = function(data,responseHeaders){
            var id = locationParser(responseHeaders);
            flash.setMessage({'type':'success','text':'The telefone was created successfully.'});
            $location.path('/Telefones');
        };
        var errorCallback = function(response) {
            if(response && response.data) {
                flash.setMessage({'type': 'error', 'text': response.data.message || response.data}, true);
            } else {
                flash.setMessage({'type': 'error', 'text': 'Something broke. Retry, or cancel and start afresh.'}, true);
            }
        };
        TelefoneResource.save($scope.telefone, successCallback, errorCallback);
    };
    
    $scope.cancel = function() {
        $location.path("/Telefones");
    };
});