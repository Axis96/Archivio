<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

    <link rel="stylesheet" href="static/fonts/material-icon/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" href="static/css/style.css">
<head>
<meta charset="ISO-8859-1">
<title>Gestione Dati</title>
</head>

<body>

<body>
	<div class="main">
  <section class="sign-in">
            <div class="container">
                <div class="signin-content">
             

                    <div class="signin-form">
                        <h2 class="form-title">Gestione Dati</h2>
                        <br>

                        
                        <form action="Homepage" method="POST" >
                            <div class="form-group">
                                <label for="your_name"><i class="zmdi zmdi-account material-icons-name"></i></label>
                                <input type="text" name="nome" required="required" id="your_name" placeholder="Nome"/>
                            </div>
                            <div class="form-group">
                                <label for="your_surname"><i class="zmdi zmdi-lock"></i></label>
                                <input type="text" required="required" name="cognome" id="your_pass" placeholder="Cognome"/>
                            </div>
                            <div class="form-group form-button">
                                <input type="submit" name="scelta" id="signin" class="form-submit" value="Inserisci Persona"/>
                            </div>
                        </form>
                        
                      <table class="table table-striped">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Cognome</th>
				<th>Numero</th>
			</tr>
		</thead>
		<c:forEach items="${persona}" var="lista"> 
			<tbody>
				<tr>
					<td><c:out value="${persona.getNome()}" /></td> 
 					<td><c:out value="${persona.getCognome()}" /></td>
 					<td><c:out value="${persona.getNumero()}" /></td>
 					<td>
   					 	<input type="hidden" name ="id" value="${persona.getId()}"><br><br>
						</form>
					</td> 
				</tr>
		</c:forEach> 
		</tbody>
	</table>
						
                    </div>
                </div>
            </div>
        </section>
</div>
</body>
</html>