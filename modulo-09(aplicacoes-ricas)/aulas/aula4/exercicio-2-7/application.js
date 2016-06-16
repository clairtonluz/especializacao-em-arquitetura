$(document).ready(function () {

    $('button').on('click', function () {
        $.ajax('bebidas/favoritas/1.json', {
            dataType: 'json',
            success: function (response) {
                // $.each(response, function (index, bebida) {
                //     var destaque = $('.destaque-' + index);
                //     destaque.find('p').html(bebida.nome);
                //     destaque.find('img').attr('src', bebida.imagem);
                // });

                $.map(response, function (bebida, index) {
                    var destaque = $('.destaque-' + index);
                    destaque.find('p').html(bebida.nome);
                    destaque.find('img').attr('src', bebida.imagem);
                    return response;
                });
            },
            contentType: 'application/json'
        });
    })
});