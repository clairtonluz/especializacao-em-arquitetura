function Receita(el) {
    this.el = el;
    this.receita = this.el.find(".receita");

    var solicitacao = this;

    this.carregamentoOk = function() {
        
    }

    this.exibirFoto = function(event) {
    }

}



$(document).ready(function () {
    var limao = new Receita($("#limao"));
    var negro = new Receita($("#negro"));
});