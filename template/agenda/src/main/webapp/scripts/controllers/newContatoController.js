
angular.module('agenda').controller('NewContatoController', function ($scope, $location, locationParser, flash, ContatoResource , PessoaResource, TelefoneResource) {
    $scope.disabled = false;
    $scope.$location = $location;
    $scope.contato = $scope.contato || {};
    
    $scope.pessoaList = PessoaResource.queryAll(function(items){
        $scope.pessoaSelectionList = $.map(items, function(item) {
            return ( {
                value : item.id,
                text : item.nome
            });
        });
    });
    $scope.$watch("pessoaSelection", function(selection) {
        if ( typeof selection != 'undefined') {
            $scope.contato.pessoa = {};
            $scope.contato.pessoa.id = selection.value;
        }
    });
    
    $scope.telefonesList = TelefoneResource.queryAll(function(items){
        $scope.telefonesSelectionList = $.map(items, function(item) {
            return ( {
                value : item.id,
                text : item.numero
            });
        });
    });
    $scope.$watch("telefonesSelection", function(selection) {
        if (typeof selection != 'undefined') {
            $scope.contato.telefones = [];
            $.each(selection, function(idx,selectedItem) {
                var collectionItem = {};
                collectionItem.id = selectedItem.value;
                $scope.contato.telefones.push(collectionItem);
            });
        }
    });


    $scope.save = function() {
        var successCallback = function(data,responseHeaders){
            var id = locationParser(responseHeaders);
            flash.setMessage({'type':'success','text':'The contato was created successfully.'});
            $location.path('/Contatos');
        };
        var errorCallback = function(response) {
            if(response && response.data) {
                flash.setMessage({'type': 'error', 'text': response.data.message || response.data}, true);
            } else {
                flash.setMessage({'type': 'error', 'text': 'Something broke. Retry, or cancel and start afresh.'}, true);
            }
        };
        ContatoResource.save($scope.contato, successCallback, errorCallback);
    };
    
    $scope.cancel = function() {
        $location.path("/Contatos");
    };
});