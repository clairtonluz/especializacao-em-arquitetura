$(document).ready(function () {
    $('#bebidas button').on('click', function () {
        var bebida = $(this).closest(".bebida");
        var valor = bebida.data('preco');
        var preco = $("<p>R$" + valor + "</p>");
        bebida.append(preco);
        $(this).remove();
    });

    $('.filtro-promo').on('click', function () {
        $('li').removeClass('destacada');
        $('.promocao').addClass('destacada');
    });


    $('.filtro-sem-alcool').on('click', function () {
        $('li').removeClass('destacada');
        $('.sem-alcool').addClass('destacada');
    });

});