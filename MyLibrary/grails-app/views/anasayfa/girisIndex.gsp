<!DOCTYPE html>
<html lang="tr">
<head>
    <link href="https://fonts.googleapis.com/css2?family=EB+Garamond:wght@400;700&display=swap" rel="stylesheet">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Giriş Sayfası</title>
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
    .giris {
        background-color: rgba(0, 0, 0, 0.5);
        border-radius: 20px;
        max-width: 550px;
        width: 90%;
        backdrop-filter: blur(5px);
        padding: 20px;
    }
    @media (max-width: 576px) {
        .giris {
            padding: 15px;
        }
    }
    </style>
</head>
<body>
<div class="giris p-4">
    <h2 class="text-center">Giriş Yap</h2>
    <div class="text-center mb-4">
        <button class="btn btn-outline-danger mx-2" id="userLoginBtn">Kullanıcı Girişi</button>
        <button class="btn btn-outline-success mx-2" id="adminLoginBtn">Yönetici Girişi</button>
    </div>

    <div id="userLogin" class="form-container">
        <h4>Kullanıcı Girişi</h4>
        <form>
            <div class="form-group">
                <label for="userIdentifier">Kullanıcı Adı \ E-posta:</label>
                <input type="text" class="form-control" id="userIdentifier" placeholder="Kullanıcı Adı\E-posta:" required>
            </div>
            <div class="form-group">
                <label for="userPassword">Şifre:</label>
                <input type="password" class="form-control" id="userPassword" placeholder="Şifrenizi girin" required>
            </div>
            <button type="submit" class="btn btn-primary">Giriş Yap</button>
            <div class="mt-3 row">
                <a href="#" class="col">Şifremi unuttum</a>
                <a href="#" class="col">Kayıt Ol</a>
            </div>
        </form>
    </div>

    <div id="adminLogin" class="form-container">
        <h4>Yönetici Girişi</h4>
        <form>
            <div class="form-group">
                <label for="adminIdentifier">Kullanıcı Adı \ E-posta:</label>
                <input type="text" class="form-control" id="adminIdentifier" placeholder="Kullanıcı Adı\E-posta:" required>
            </div>
            <div class="form-group">
                <label for="adminPassword">Şifre:</label>
                <input type="password" class="form-control" id="adminPassword" placeholder="Şifrenizi girin" required>
            </div>
            <button type="submit" class="btn btn-primary">Giriş Yap</button>
            <div class="mt-3 row">
                <a href="#" class="col">Şifremi unuttum</a>
                <a href="#" class="col">Kayıt Ol</a>
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

        // Varsayılan olarak kullanıcı girişi gösterilir
        $('#userLogin').addClass('active');
    });
</script>
</body>
</html>
