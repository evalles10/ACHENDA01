
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="es">

<head>
	<title>ACHENDA</title>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="Company Coming soon Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements"/>
    <script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- font files -->
	<link href="//fonts.googleapis.com/css?family=Work+Sans:100,200,300,400,500,600,700,800,900" rel="stylesheet">
	<!-- /font files -->
	<!-- css files -->
	<link href="resources/css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="resources/css/font-awesome.css" rel="stylesheet" type="text/css" media="all" />
	<!-- /css files -->
	<body>
		<div class="banner-layer">
			<div class="logo text-center">
				<h1>		
						ACHENDA
				</h1>
			</div>
			
			<main>

		
		<div id="cuerpo">
		<div id="contenido" style="margin:25px">
			<div class="container">
	<h1>Listado de Empleados</h1><br/><br/>
	</div>


						<div class="container">
			<table class="table">
				<thead>
					<tr>
						
						<th>NOMBRE</th>
						<th>CODIGO EMPLEADO</th>
						<th>DEPARTAMENTO</th>
					
					</tr>
				</thead>
				<tbody>
				<!-- FOR EACH begin="1" end= "${ no }" step="1" varStatus="loopCounter"
        value="${lstBooks}" var="book"-->
				<c:forEach var="empleado" items="${listaempleados}">
					<tr >
						<td><a href="mostrarEmpleado?id=${empleado.idempleados}">
							<c:out value="${empleado.personaid.nombre} ${empleado.personaid.apellido1} ${empleado.personaid.apellido2}"/>
						</a></td>
						<td><c:out value="${empleado.codempleado}"/></td>
						<td><c:out value="${empleado.departamento.nombre}"/></td>
						<td><form method = "post" action ="deleteEmpleado">
							<input type="hidden" name = "id" value="${empleado.idempleados}"/>
							<input  type="submit" value=" Eliminar "/></form></td>
					</tr>
							
				</c:forEach>
				</tbody>
			</table>
				<!-- row -->
				<div class="row">
				
				</div>
				<!-- /row -->
			</div>
							<%
								/*List categoria = new ArrayList<>();
								categoria = Categoria.listarEmpleados();
								
								for (int i = 0; i < categoria.size(); i++) {
									out.print("<div class=\"input-checkbox\">");
									String a = String.valueOf(i + 1);
									String f=categoria.get(i).toString();
									if(f.equalsIgnoreCase("Programador")){
									 f="Programador";
									}
									out.print("<a href=\"BuscarPorCategoria?buscarPorCategoria=" + f + "\" class=\"hiper\">");
									out.print("<label for=\"category-" + a + "\">");
									out.print("<span></span>");
									out.print(categoria.get(i));
									out.print("</label>");
									out.print("</a>");
									out.print("</div>");
								}*/
							%>
</div>
<br/><br/>
<div id="listadoclientes" style="width:100%"></div>


		</div> <!-- fin div contenido -->
		<div class="clearfix"></div>
		</main>
			
			<div class="footer">
				<p> &copy; 2018 Company Coming soon . All Rights Reserved.Design by
					<a href="http://w3layouts.com" target="=_blank">W3layouts</a>
				</p>
			</div>
		</div>
	</body>
</html>