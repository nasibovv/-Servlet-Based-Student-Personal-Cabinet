<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body {
            font-family: Georgia, serif;
            background-color: grey;
        }
        * {
            box-sizing: border-box;
            width: 80%;
        }
        .container {
            margin-left: 350px;
            margin-top: 100px;
            padding: 16px;
            background-color: white;
            height: 600px;
            width: 800px;

        }
        input[type=text], input[type=password] {
            width: 100%;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }

        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }
        hr {
            border: 1px solid #0000ff;
            margin-bottom: 25px;
            margin-left:2px;
        }

        .registerbtn {
            background-color: blue;
            color: white;
            padding: 16px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
            font-size:15px;
        }
        .registerbtn:hover {
            opacity: 0.8;
        }

    </style>
</head>
<body>

    <form action="/helloworld/register" method="POST">
        <div class="container">
            <h1>Registeration Page</h1>
            <p>Welcome to Esmiralda's web page</p>
            <hr>

            <label for="email"><b>Email</b></label>
            <input type="text" placeholder="Enter Email" name="email" id="email" required>

            <label for="password"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password" id="password" required>

            <label for="psw-repeat"><b>Repeat Password</b></label>
            <input type="password" placeholder="Repeat Password" name="psw-repeat" id="psw-repeat" required>
            <hr>

            <button type="submit" class="registerbtn">Register</button>
        </div>


    </form>

</body>
</html>