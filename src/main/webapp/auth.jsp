
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Auth Page | SuccessFactors</title>
    <style>
        .center{
            margin: 0 auto;
        }
    </style>
</head>
<body>
<div class="center">
    <h1>Auth Page</h1>
    <form action="auth" method="POST">
        <div>
            <label for="email">Username:</label>
            <input id="email" type="text" name="email" placeholder="Email..."/>
        </div>
        <div>
            <label for="password">Password:</label>
            <input id="password" type="password" name="password" placeholder="Password..."/>
        </div>
        <input type="submit" name="submit" value="Submit"/>
    </form>

</div>
</body>
</html>
