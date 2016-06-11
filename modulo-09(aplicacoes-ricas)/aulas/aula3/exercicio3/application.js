$(document).ready(function () {
    $("button").on("click", function () {
        var value = $("<p>R$ 1,99</p>");
        $(this).after(value);
        $(this).remove();
    });
});