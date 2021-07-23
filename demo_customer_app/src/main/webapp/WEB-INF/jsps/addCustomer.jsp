<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer</title>
</head>
<body>
<h2>Add Customer Details Here</h2>
<form action="saveCustomer" method="post">
<pre>
Id:<input type="text" name="id"/>
FirstName:<input type="text" name="firstname"/>
LastName:<input type="text" name="lastname"/>
City:<input type="text" name="city"/>
<input type="submit" value="save"/>
</pre>

</form>
${msg}
<br/>
<br/>
<a href="listCustomer">All customers</a>
</body>
</html>