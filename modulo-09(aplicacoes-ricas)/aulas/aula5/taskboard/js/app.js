(function () {
    var app = angular.module('taskboard', []);

    app.controller('EstoriaControle', function () {
        this.estorias = itens;

        this.selecionar = function (estoria) {
            this.selecionada = estoria;
        };

        this.fechar = function (indice) {
            this.estorias.splice(indice, 1);
        }

    });

    app.controller('TarefaControle', function () {
        this.tarefa = {};

        this.save = function (estoria) {
            estoria.tarefas.push(this.tarefa);
            this.tarefa = {};
        }
    });


    var itens = [{
        nome: 'Estoria 1',
        descricao: 'Descricao 1',
        pontuacao: 10,
        tarefas: [
            {nome: 'tarefa 1', descricao: 'descricao da tarefa 1', pontuacao: 10}
        ]
    }, {
        nome: 'Estoria 2',
        descricao: 'Descricao 2',
        pontuacao: 19,
        tarefas: [
            {nome: 'tarefa 2', descricao: 'descricao da tarefa 2', pontuacao: 13}
        ]
    }];
})();




