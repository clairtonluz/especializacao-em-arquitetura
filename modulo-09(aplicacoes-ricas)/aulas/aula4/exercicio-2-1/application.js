var receita = {
    init: function () {
        $('.bebidas').on('click', 'button', this.carregamentoOk);

        $('.bebidas').on('click', '.expandir', this.exibirImagem);
    },
    carregamentoOk: function () {
        var receita = $(this).closest('.bebida').find(".receita");

        if (!receita.html()) {
            $.get('http://localhost:63342/aulas/aula4/exercicio-2-1/receita.html', function (response) {
                receita.html(response);
            });
        }
        receita.slideToggle();
    },
    exibirImagem: function (event) {
        $(this).closest('.bebida').find("img").show();
    }
};

$(document).ready(function () {
    receita.init();
});