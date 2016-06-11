$(document).ready(function () {
    $("button").on("click", function () {
        var valor = $(this).closest('.bebida').data("preco");
        var preco = $("<p>R$ " + valor + "</p>");
        $(this).after(preco);
        $(this).remove();
    })
});