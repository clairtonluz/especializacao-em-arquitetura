$(document).ready(function () {

    $('form').on('submit', function (event) {
        event.preventDefault();
        $.ajax($('form').attr('action'), {
            type: 'POST',
            dataType: 'json',
            success: function (response) {
                $('form').remove()
                var result = "Pedido:" + response.pedido
                    + ", Sanduiche: " + response.sanduiche
                    + ", Quantidade: " + response.quantidade
                    + ", Total: " + response.total;
                // var result = JSON.stringify(response).replaceAll('{', '');
                $('#pedido').hide().html(result).fadeIn();
            },
            contentType: 'application/json'
        });
    });
});