$(document).ready(function () {
    $("button").on("click", function () {
        var preco = (Math.random() * 5).toFixed(2);
        var value = $("<p>R$ " + preco + "</p>");
        $(this).after(value);
        $(this).remove();
    });
});