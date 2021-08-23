<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<form object="${student}" method="post" action="${pageContext.request.contextPath}/update">
    <label>ID</label><br>
    <input name="id" value="${student.id}" /><br><br>
    <label>Name</label><br>
    <input name="name" value="${student.name}" /><br><br>
    <label>Age</label><br>
    <input name="age" value="${student.age}" type="text"/><br><br>
    <input type="submit" value="Update" />
</form>
</body>

</html>