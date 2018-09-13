
<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page import="com.agenda.model.Empleado"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
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
			
			
			
			
            <div class="w3ls-container   text-center">
                <div class="w3l-content">
                
                <c:forEach var="empleado" items="${empleado}">
                
                    <div class="right-grid">
                        <p>${empleado.idempleados}</p>
                        <div class="footer-grids">
                            <p>0926k 4th block building,king Avenue, </p>
                            <p class="my-2">New York City,USA</p>
                            <p class="phone"><span class="fa fa-phone"></span>phone: +0444 555 6789</p>
                            <p class="phone my-2"><span class="fa fa-fax"></span>Fax: +0444 555 6789</p>
                            <p class="phone"><span class="fa fa-envelope"></span>Mail:
                                <a href="mailto:info@example.com">info@example.com</a>
                            </p>
                        </div>
                        <div class="agileinfo-social-grids">
                            <ul>
                                <li><a href="#"><span class="fa fa-facebook"></span></a></li>
                                <li><a href="#"><span class="fa fa-twitter"></span></a></li>
                                <li><a href="#"><span class="fa fa-rss"></span></a></li>
                                <li><a href="#"><span class="fa fa-vk"></span></a></li>
                            </ul>
                        </div>
                    </div>
                </c:forEach>
                </div>
            </div>
			
			<div class="footer">
				<p> &copy; 2018 Company Coming soon . All Rights Reserved.Design by
					<a href="http://w3layouts.com" target="=_blank">W3layouts</a>
				</p>
			</div>
		</div>
	</body>
</html>