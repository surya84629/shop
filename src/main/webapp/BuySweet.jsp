<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style> 
body{background-color:gray;}
select{width:25%;}
</style>
</head>
<body >
	  <center><h1>Sweet Shop</h1>
    <form action="buySweet" method="post">
        <label >Sweet:</label>
        <select name="sweetNames" id="sweet">
            <option value="Chocolate">Chocolate</option>
            <option value="Caramel">Caramel</option>
            <option value="Gummy Bears">Gummy Bears</option>
        </select>
        <br>
        <br>
        <label >Quantity (kg):</label>
        <input type="text" name="quantity" id="quantity" min="1" required>
        <br>
        <br>
        <input type="submit" value="Buy" style="background-color:red;">
        
    </form>
    </center>
    <%
		
			String message=(String)request.getAttribute("msg");
    		String stock=(String)request.getAttribute("stock");
			if( message != null)
			{
		%>
		<center>
			<h1 style="color: black;" ><%= message %></h1>
			<h1 style="color: black;"> <%= stock %></h1>
		</center>
		<% 
			}
		%>
</body>
</html>
  

