$(document).ready(function(){
   $('#bebidas button').on('click', function() {
      var bebida = $(this).closest(".bebida");
   		var valor = bebida.data('preco');
   		var preco = $("<p>R$" + valor + "</p>");
   		bebida.append(preco);
   		$(this).remove();
	});
	

});