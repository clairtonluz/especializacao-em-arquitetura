(function () {
    var app = angular.module('livraria', []);

    app.controller('LojaControle', function () {
        this.acervo = livros;
    });

    app.controller('AbasControle', function () {
        this.aba = 1;

        this.setAba = function (aba) {
            this.aba = aba;
        };

        this.isSet = function (aba) {
            return this.aba == aba;
        }
    });

    app.controller('ComentarioControle', function () {
        this.comentario = {};

        this.addComentario = function (livro) {
            livro.comentarios.push(this.comentario);
            this.comentario = {};
        };
    });

    var livros = [{
        titulo: 'O senhor  dos Aneis',
        preco: 45.6,
        descricao: 'Descricao 1',
        quantidade: 10,
        comentarios: [{autor: 'clairton', texto: 'texto 1'}, {autor: 'fulano', texto: 'texto 2'}]
    }, {
        titulo: 'A Saga Star Wars',
        preco: 35.6,
        descricao: 'Descricao 2',
        quantidade: 0,
        comentarios: [{autor: 'autor 1', texto: 'texto 1'}, {autor: 'autor 2', texto: 'texto 2'}]
    }];
})();




