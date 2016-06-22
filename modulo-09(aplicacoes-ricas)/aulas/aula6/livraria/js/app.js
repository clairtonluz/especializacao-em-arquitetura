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
        };
    });

    app.controller('ComentarioControle', function () {
        this.comentario = {};

        this.addComentario = function (livro) {
            livro.comentarios.push(this.comentario);
            this.comentario = {};
        };
    });

    app.directive('livroDescricao', function () {
        return {
            templateUrl: 'livro.descricao.html'
        };
    });

    var livros = [
        {
            titulo: 'O Senhor dos Aneis',
            preco: 40.0,
            descricao: 'Descricao 1',
            quantidade: 10,
            comentarios: [{
                autor: "Autor1",
                texto: "Texto 1"
            }, {
                autor: "Autor2",
                texto: "Texto 2"
            }]

        }, {
            titulo: 'A Saga Star Wars',
            preco: 80.0,
            descricao: 'Descricao 2',
            quantidade: 0,
            comentarios: [{
                autor: "Autor1",
                texto: "Texto 1"
            }, {
                autor: "Autor2",
                texto: "Texto 2"
            }]
        }
    ]

})();




