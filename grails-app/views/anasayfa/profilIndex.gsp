<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profil Görüntüle</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
    body {
        background-image: url('https://images.unsplash.com/photo-1697791173189-d56b15df4f33?q=80&w=2072&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D'); /* Arka plan resmi */
        background-size: cover; /* Resmin tüm sayfayı kaplaması için */
        background-position: center; /* Resmin ortalanması için */
        background-repeat: no-repeat; /* Resmin tekrarlanmaması için */
    }

    .profile-container {
        max-width: 600px;
        margin: 50px auto;
        padding: 30px;
        background-color: rgba(255, 255, 255, 0.9); /* Daha beyaz arka plan */
        border-radius: 15px;
        box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.2);
        transition: all 0.3s ease; /* Geçiş efektleri için */
    }

    .profile-img {
        display: block;
        margin: 0 auto 20px;
        width: 150px;
        height: 150px;
        border-radius: 50%;
        object-fit: cover;
        border: 4px solid #007bff; /* Mavi bir çerçeve */
    }

    h2 {
        font-family: 'Arial', sans-serif;
        color: #007bff; /* Başlık rengi */
        margin-bottom: 20px;
    }

    .profile-info p {
        font-size: 1.1rem;
        margin-bottom: 10px;
        color: #333;
    }

    .hidden {
        display: none;
    }

    .btn-secondary {
        background-color: #007bff; /* Buton rengi */
        border: none;
    }

    .btn-secondary:hover {
        background-color: #0056b3; /* Hover efekti */
    }

    .form-control {
        border-radius: 8px; /* Form elemanları için yuvarlak köşe */
    }

    .form-label {
        font-weight: bold; /* Etiketleri kalın yap */
    }
    </style>
</head>
<body>

<div class="container">
    <div class="profile-container">
        <h2 class="text-center">Profilim</h2>

        <div class="text-center">
            <img src="https://images.unsplash.com/photo-1438761681033-6461ffad8d80?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D" alt="Profil Resmi" class="profile-img">
        </div>

        <div id="profileInfo" class="profile-info">
            <p><strong>İsim:</strong> <span id="firstName">Ahmet</span></p>
            <p><strong>Soyisim:</strong> <span id="lastName">Yılmaz</span></p>
            <p><strong>Kullanıcı Adı:</strong> <span id="username">ahmet_yilmaz</span></p>
            <p><strong>E-posta:</strong> <span id="email">ahmet.yilmaz@example.com</span></p>
        </div>

        <div id="editProfile" class="hidden">
            <form action="/profile/update" method="POST" enctype="multipart/form-data">
                <div class="mb-3">
                    <label for="firstNameInput" class="form-label">İsim</label>
                    <input type="text" class="form-control" id="firstNameInput" name="firstName" value="Ahmet" required>
                </div>

                <div class="mb-3">
                    <label for="lastNameInput" class="form-label">Soyisim</label>
                    <input type="text" class="form-control" id="lastNameInput" name="lastName" value="Yılmaz" required>
                </div>

                <div class="mb-3">
                    <label for="usernameInput" class="form-label">Kullanıcı Adı</label>
                    <input type="text" class="form-control" id="usernameInput" name="username" value="ahmet_yilmaz" required>
                </div>

                <div class="mb-3">
                    <label for="emailInput" class="form-label">E-posta</label>
                    <input type="email" class="form-control" id="emailInput" name="email" value="ahmet.yilmaz@example.com" required>
                </div>

                <div class="mb-3">
                    <label for="passwordInput" class="form-label">Şifre</label>
                    <input type="password" class="form-control" id="passwordInput" name="password" placeholder="Yeni şifre giriniz (değiştirmek için)">
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Kaydet</button>
                </div>
            </form>
        </div>

        <div class="d-grid mt-4">
            <button id="editButton" class="btn btn-outline-primary my-2">Düzenle</button>

            <a href="./anasayfa" class="btn btn-outline-success my-2">Ana Sayfaya Dön</a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
<script>
    const editButton = document.getElementById('editButton');
    const profileInfo = document.getElementById('profileInfo');
    const editProfile = document.getElementById('editProfile');

    editButton.addEventListener('click', () => {
        profileInfo.classList.toggle('hidden');
        editProfile.classList.toggle('hidden');
        editButton.textContent = editButton.textContent === 'Düzenle' ? 'İptal' : 'Düzenle';
    });
</script>
</body>
</html>
