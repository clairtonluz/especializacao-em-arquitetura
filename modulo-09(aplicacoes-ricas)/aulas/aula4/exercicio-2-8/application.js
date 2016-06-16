$(document).ready(function () {
    $('button').on('click', function () {
        $.ajax('bebidas/favoritas/1.json', {
            dataType: 'json',
            success: function (response) {
                $.each(response, function (index, bebida) {
                    console.log(index);
                    var destaque = $('.destaque-' + index);
                    destaque.find('p').html(bebida.nome);
                    destaque.find('img').attr('src', bebida.imagem);
                });
            },
            contentType: 'application/json'
        });

        // $.getJSON('status/todos.json', function (result) {
        //     $.map(result, function (item, indice) {
        //         var itemPedido = $("<li></li>");
        //         $('<h3>' + item.nome + '</h3>').appendTo(itemPedido);
        //         return itemPedido;
        //     });
        //
        //     console.log(result);
        //     $('ul').html(result);
        // });
    });

});