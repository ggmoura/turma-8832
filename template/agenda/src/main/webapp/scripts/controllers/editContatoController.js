

angular.module('agenda').controller('EditContatoController', function($scope, $routeParams, $location, flash, ContatoResource , PessoaResource, TelefoneResource) {
    var self = this;
    $scope.disabled = false;
    $scope.$location = $location;
    
    $scope.get = function() {
        var successCallback = function(data){
            self.original = data;
            $scope.contato = new ContatoResource(self.original);
            PessoaResource.queryAll(function(items) {
                $scope.pessoaSelectionList = $.map(items, function(item) {
                    var wrappedObject = {
                        id : item.id
                    };
                    var labelObject = {
                        value : item.id,
                        text : item.nome
                    };
                    if($scope.contato.pessoa && item.id == $scope.contato.pessoa.id) {
                        $scope.pessoaSelection = labelObject;
                        $scope.contato.pessoa = wrappedObject;
                        self.original.pessoa = $scope.contato.pessoa;
                    }
                    return labelObject;
                });
            });
            TelefoneResource.queryAll(function(items) {
                $scope.telefonesSelectionList = $.map(items, function(item) {
                    var wrappedObject = {
                        id : item.id
                    };
                    var labelObject = {
                        value : item.id,
                        text : item.numero
                    };
                    if($scope.contato.telefones){
                        $.each($scope.contato.telefones, function(idx, element) {
                            if(item.id == element.id) {
                                $scope.telefonesSelection.push(labelObject);
                                $scope.contato.telefones.push(wrappedObject);
                            }
                        });
                        self.original.telefones = $scope.contato.telefones;
                    }
                    return labelObject;
                });
            });
        };
        var errorCallback = function() {
            flash.setMessage({'type': 'error', 'text': 'The contato could not be found.'});
            $location.path("/Contatos");
        };
        ContatoResource.get({ContatoId:$routeParams.ContatoId}, successCallback, errorCallback);
    };

    $scope.isClean = function() {
        return angular.equals(self.original, $scope.contato);
    };

    $scope.save = function() {
        var successCallback = function(){
            flash.setMessage({'type':'success','text':'The contato was updated successfully.'}, true);
            $scope.get();
        };
        var errorCallback = function(response) {
            if(response && response.data && response.data.message) {
                flash.setMessage({'type': 'error', 'text': response.data.message}, true);
            } else {
                flash.setMessage({'type': 'error', 'text': 'Something broke. Retry, or cancel and start afresh.'}, true);
            }
        };
        $scope.contato.$update(successCallback, errorCallback);
    };

    $scope.cancel = function() {
        $location.path("/Contatos");
    };

    $scope.remove = function() {
        var successCallback = function() {
            flash.setMessage({'type': 'error', 'text': 'The contato was deleted.'});
            $location.path("/Contatos");
        };
        var errorCallback = function(response) {
            if(response && response.data && response.data.message) {
                flash.setMessage({'type': 'error', 'text': response.data.message}, true);
            } else {
                flash.setMessage({'type': 'error', 'text': 'Something broke. Retry, or cancel and start afresh.'}, true);
            }
        }; 
        $scope.contato.$remove(successCallback, errorCallback);
    };
    
    $scope.$watch("pessoaSelection", function(selection) {
        if (typeof selection != 'undefined') {
            $scope.contato.pessoa = {};
            $scope.contato.pessoa.id = selection.value;
        }
    });
    $scope.telefonesSelection = $scope.telefonesSelection || [];
    $scope.$watch("telefonesSelection", function(selection) {
        if (typeof selection != 'undefined' && $scope.contato) {
            $scope.contato.telefones = [];
            $.each(selection, function(idx,selectedItem) {
                var collectionItem = {};
                collectionItem.id = selectedItem.value;
                $scope.contato.telefones.push(collectionItem);
            });
        }
    });
    
    $scope.get();
});