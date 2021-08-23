<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Person List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Students</h1>

<br/><br/>
<div>
    <table>
        <tr>
            <th>Name</th>
            <th>Age</th>
            <th>Delete</th>
            <th>Update</th>
        </tr>
        <c:forEach  items="${students}" var ="student">
            <tr>
                <form></form>
                <td>
                    <input name="name" value="${student.name}"/>
                </td>
                <td>
                    <input name="age" value="${student.age}"/>
                </td>

                <td>
                    <form action="${pageContext.request.contextPath}/${student.id}" method="post">
                        <input type="hidden" name="id"/>
                        <input type="submit" value="Delete" />
                    </form>
                </td>

                <td>
                    <form action="${pageContext.request.contextPath}/${student.id}">
                        <input type="submit" value="Update" />
                    </form>
                </td>
                </form>
            </tr>
        </c:forEach>
    </table>

    <br/><br/>

    <a href="${pageContext.request.contextPath}/add">Add student</a>
</div>
</body>

</html>