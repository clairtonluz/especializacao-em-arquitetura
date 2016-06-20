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

    var livros = [{
        titulo: 'O senhor  dos Aneis',
        preco: 45.6,
        descricao: 'Descricao 1',
        quantidade: 10
    }, {
        titulo: 'A Saga Star Wars',
        preco: 35.6,
        descricao: 'Descricao 2',
        quantidade: 0
    }];
})();




