<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="Model.Book" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Trang chủ</title>

</head>
<style>
    .global-wrapper{
        display: flex;
        width: 100%;
        height: 500vh;
        background-color: #f6f8f9;
        justify-content: center;
        align-items: center;
    }

    .log-out {
        padding-left: 80%;
        padding-top: 30px;
        display: flex;
        margin-top: 20px;
        width: 500px;
        height: 100px;
        background-color: #ffff;
    }

    button {
        height: 45px;
        width: 150px;
        background-color: aqua;
        border-radius: 10px;
    }

    button :hover{
        background-color: #5b54b3;
        transition: .2s;
    }

    .div-form {
        width: 70%;
        height: 500px;
        padding: 50px 100px;
        justify-content: center;
        text-align: center;
        background-color: aliceblue;
    }

    .form {
        margin: auto;

    }

    input[type=text] {
        width: 300px;
        height: 40px;
        border-radius: 10px;
        font-size: large;

    }

    table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
    }

    table {
        margin: auto;
        margin-top: 30px;
    }

    th, td {
        padding: 15px;
        width: 100px;
    }
</style>
<body>
<div class="log-out">
    <a href="./login.jsp">
        <button>Đăng xuất</button>
    </a>
</div>
<div class="search-container">
    <form action="search" method="GET">
        <input type="text" placeholder="Enter book name..." name="name-search">
        <button type="submit">Search</button>
    </form>
</div>
<div>
    <table style="text-align: center">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Publisher</th>
            <th>Price</th>
        </tr>
        <% List<Book> listBooks = (List<Book>) request.getAttribute("listBook"); %>
        <% if (listBooks != null) { %>
        <% for (Book book : listBooks) { %>
        <tr>
            <td><%=book.getId()%>
            </td>
            <td><%=book.getName()%>
            </td>
            <td><%=book.getPublisher()%>
            </td>
            <td><%=book.getPrice()%>
            </td>
            <td>
                <a href="editBook.jsp?id=<%=book.getId()%>">Edit</a>
            </td>
            <td>
                <a href="/update?id=<%=book.getId()%>">Delete</a>
            </td>
        </tr>
        <% } %>
        <% } %>
    </table>
    <button class="refresh-button" type="button" onclick="window.location.reload();">
        Refresh
    </button>
</div>
</body>
</html>
