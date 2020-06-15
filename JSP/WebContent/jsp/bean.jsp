<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Funciona</title>
</head>
<body>

	<jsp:useBean id="dato" class="JavaBeans.Datos"
		scope="session">
		<jsp:setProperty name="dato" property="mensaje" param="*"/>
	</jsp:useBean>
	
	<p>  
		<jsp:getProperty name="dato" property="mensaje" />
	</p>

	<p>
		Valor de la variable contador: 
		<jsp:getProperty name="dato" property="fecha" />
	</p>

	<p>
		Valor de la variable contador: 
		<jsp:getProperty name="dato" property="contador" />
	</p>
</body>
</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>