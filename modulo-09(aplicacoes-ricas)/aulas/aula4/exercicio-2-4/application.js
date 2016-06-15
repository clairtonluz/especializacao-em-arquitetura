function Receita(el) {
    this.el = el;
    this.receita = this.el.find(".receita");

    var solicitacao = this;

    this.carregamentoOk = function () {
        var receita = $(this).closest('.bebida').find(".receita");

        $.ajax('http://localhost:63342/aulas/aula4/exercicio-2-4/receita.html',
            {
                context: solicitacao,
                success: function (response) {
                    this.receita.html(response).slideDown();
                }
            });
    };

    this.exibirFoto = function (event) {
        event.preventDefault();
        solicitacao.receita.find("img").show();
    };

    this.el.on('click', 'button', this.carregamentoOk);
    this.el.on('click', '.expandir', this.exibirFoto);


}

$(document).ready(function () {
    var limao = new Receita($("#limao"));
    var negro = new Receita($("#negro"));
});