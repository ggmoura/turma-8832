angular.module('agenda').factory('ContatoResource', function($resource){
    var resource = $resource('rest/contatos/:ContatoId',{ContatoId:'@id'},{'queryAll':{method:'GET',isArray:true},'query':{method:'GET',isArray:false},'update':{method:'PUT'}});
    return resource;
});