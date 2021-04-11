<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.io.PrintWriter" %>
<html>
<head>
    <title>Login Form</title>
</head>
<style>
    .global-wrapper {
        background-color: #f6f8f9;
        width: 100%;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .sign-in {
        background: #fff;
        min-width: 300px;
        min-height: 300px;
        padding: 80px 50px 30px 50px;
        border-radius: 10px;
        color: rgb(110, 120, 130);
        font-family: Arial;
    }

    .sign-in__header {
        display: flex;
        justify-content: center;
    }

    .sign-in__header > img {
        height: 100px;
        width: 200;
        margin: 20px 20px;
    }


    form {
        display: flex;
        flex-direction: column;
        font-size: 12px;
    }

    form > input {
        margin-top: 10px;
        margin-bottom: 20px;
        padding: 5px 15px;
        border: 2px solid rgb(110, 120, 130);
        border-radius: 6px;
        height: 40px;
        width: 300x;
        font-family: inherit;
    }


    input[type=button] {
        background-color:#5e53e0;
        border: 1px solid #5e53e0;
        border-radius: 10px;
        font-size: 16px;
        font-family: inherit;
        display: block;
        width: 100%;
        height: 36px;
        color: #fff;
        margin-top: 32px;
    }

    input[type=button]:hover {
        background-color: #5b54b3;
        transition: .2s;
    }

</style>
<body>
<body>
<div class="global-wrapper">
    <div class="sign-in">
        <a class="sign-in__header" href="">
            <img src="" alt="logo">
        </a>
        <div class="sign-in__body">
            <form class="form" action="login" method="post">
                <label>Username</label>
                <input type="text" name="username" required="true">
                <label>Password</label>
                <input type="password" name="password" required="true">
                <input type="submit" value="Log in">
            </form>
        </div>
    </div>
</div>
</body>
</body>
</html>
