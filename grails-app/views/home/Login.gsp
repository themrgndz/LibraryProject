<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://fonts.googleapis.com/css2?family=EB+Garamond:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
    body {
        font-family: 'Garamond', serif;
        background: url('https://images.unsplash.com/photo-1505664194779-8beaceb93744?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D') no-repeat center center fixed;
        background-size: cover;
        color: white;
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
    }
    .form-container {
        display: none;
    }
    .form-container.active {
        display: block;
    }
    .login {
        background-color: rgba(0, 0, 0, 0.5);
        border-radius: 20px;
        max-width: 550px;
        width: 90%;
        backdrop-filter: blur(5px);
        padding: 20px;
    }
    @media (max-width: 576px) {
        .login {
            padding: 15px;
        }
    }
    .form-control{
        background-color: rgb(20,20,20,0.8);
        color: #EFEFEF;
    }
    </style>
</head>
<body>
<div class="login p-4">
    <h2 class="text-center">Uzmar Library</h2>
    <div class="text-center mb-4">
        <button class="btn btn-outline-danger mx-2" id="userLoginBtn">User</button>
        <button class="btn btn-outline-success mx-2" id="adminLoginBtn">Admin</button>
    </div>
    <div id="userLogin" class="form-container">
        <h4>User Login</h4>
        <form>
            <div class="form-group">
                <label for="userIdentifier">Username / Email:</label>
                <input type="text" class="form-control" id="userIdentifier" placeholder="Username / Email:" required>
            </div>
            <div class="form-group">
                <label for="userPassword">Password:</label>
                <input type="password" class="form-control" id="userPassword" placeholder="Enter your password" required>
            </div>
            <button type="submit" class="btn btn-primary">Log In</button>
            <div class="mt-3 row">
                <a href="./homepage" class="col">Forgot Password</a>
                <a href="#" class="col">Register</a>
            </div>
        </form>
    </div>

    <div id="adminLogin" class="form-container">
        <h4>Admin Login</h4>
        <form>
            <div class="form-group">
                <label for="adminIdentifier">Username / Email:</label>
                <input type="text" class="form-control" id="adminIdentifier" placeholder="Username / Email:" required>
            </div>
            <div class="form-group">
                <label for="adminPassword">Password:</label>
                <input type="password" class="form-control" id="adminPassword" placeholder="Enter your password" required>
            </div>
            <button type="submit" class="btn btn-primary">Log In</button>
            <div class="mt-3 row">
                <a href="#" class="col">Forgot Password</a>
                <a href="#" class="col">Register</a>
            </div>
        </form>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script>
    $(document).ready(function() {
        $('#userLoginBtn').click(function() {
            $('#adminLogin').removeClass('active');
            $('#userLogin').addClass('active');
        });

        $('#adminLoginBtn').click(function() {
            $('#userLogin').removeClass('active');
            $('#adminLogin').addClass('active');
        });

        $('#userLogin').addClass('active');
    });
</script>
</body>
</html>
