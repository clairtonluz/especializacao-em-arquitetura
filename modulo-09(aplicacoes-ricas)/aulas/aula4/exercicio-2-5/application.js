$(document).ready(function () {

    $('form').on('submit', function (event) {
        event.preventDefault();
        $.ajax('pedidos.html', {
            type: 'POST',
            success: function (response) {
                $('form').remove()
                $('#pedido').hide().html(response).fadeIn();
            }
        });
    });
});