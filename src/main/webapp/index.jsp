
<html>
<head>
    <title>Login</title>
   
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
        }

        .login-container {
            background-color: #fff;
            max-width: 400px;
            margin: 50 auto;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.2);
        }

        h2 {
            color: rgb(1,69,171);
        }

        form {
            text-align: left;
        }

        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

         input[type="text"]:focus,
                input[type="password"]:focus {
                    border-color: rgb(238,238,238);
                    outline: none;
                }

        input[type="submit"] {
            background-color: rgb(0,53,133);
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 10px;
            cursor: pointer;
        }


    </style>
</head>
<body>

    <div class="login-container">

        <h2>Login</h2>

        <form action="#" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>

            <label for="password">Password:</label>
            <input type="password" id="password" name "password" required>

            <input type="submit" value="Login">
        </form>

    </div>

</body>
</html>
