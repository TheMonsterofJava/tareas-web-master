$(document).ready(function() {
	$('#tablaTareas').DataTable({
		responsive : true,
		lenghtMenu : [ 3, 5, 7, 10 ],
		"language" : {
			"lengthMenu" : "Mostrar _MENU_ registros por página",
			"search" : "Buscar",
			"zeroRecords" : "No hay registros",
			"info" : "Mostrando página _PAGE_ de _PAGES_",
			"infoEmpty" : "No hay registros",
			"infoFiltered" : "(Encontrados _MAX_ de registros)",
			"paginate" : {
				"first" : "Primero",
				"last" : "Último",
				"next" : "Siguiente",
				"previous" : "Anterior"
			}
		}
	});
});