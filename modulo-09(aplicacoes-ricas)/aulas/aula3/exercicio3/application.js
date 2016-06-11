$(document).ready(function () {
    $("button").on("click", function () {
        var value = $("<p>R$ 1,99</p>");
        $("button").after(value);
        $("button").remove();
    });
});