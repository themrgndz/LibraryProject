<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kütüphane Anasayfa</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
    body {
        background: url('https://images.unsplash.com/photo-1505664194779-8beaceb93744?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D') no-repeat center center fixed;
        background-size: cover;
        color: white;
    }
    .navbar {
        margin-bottom: 20px;
    }
    .footer-bar {
        background-color: #f8f9fa;
        text-align: center;
        padding: 10px 0;
        color: black;
    }
    .kategoriler {
        background-color: rgba(255, 255, 255, 0.8);
        color: black;
        padding: 40px;
        border-radius: 10px;
    }
    .category-card {
        text-align: center;
        border: none;
        transition: transform 0.3s ease, box-shadow 0.3s ease;
        border-radius: 10px;
        padding: 10px;
    }
    .category-card:hover {
        transform: scale(1.05);
        box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
    }
    .category-icon {
        font-size: 1.5rem;
        color: #007bff;
        margin-bottom: 5px;
    }
    .category-title {
        font-size: 0.9rem;
        font-weight: bold;
    }
    </style>
</head>
<body>
<!-- Üst Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Kütüphane</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav me-auto">
                <li class="nav-item"><a class="nav-link active" href="#">Anasayfa</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Kitaplar</a></li>
                <li class="nav-item"><a class="nav-link" href="#">Kategoriler</a></li>
            </ul>
            <form class="d-flex" role="search">
                <input class="form-control me-2" type="search" placeholder="Kitap Ara" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Ara</button>
            </form>
        </div>
    </div>
</nav>

<!-- Kategoriler -->
<div class="container kategoriler">
    <h2 class="text-center mb-4">Kategoriler</h2>
    <div class="row text-center justify-content-center">
        <div class="col-lg-1 col-md-1 col-sm-2 mb-2">
            <div class="card category-card">
                <i class="fas fa-book category-icon"></i>
                <h5 class="category-title">Roman</h5>
            </div>
        </div>
        <div class="col-lg-1 col-md-1 col-sm-2 mb-2">
            <div class="card category-card">
                <i class="fas fa-flask category-icon"></i>
                <h5 class="category-title">Bilim</h5>
            </div>
        </div>
        <div class="col-lg-1 col-md-1 col-sm-2 mb-2">
            <div class="card category-card">
                <i class="fas fa-landmark category-icon"></i>
                <h5 class="category-title">Tarih</h5>
            </div>
        </div>
        <div class="col-lg-1 col-md-1 col-sm-2 mb-2">
            <div class="card category-card">
                <i class="fas fa-brain category-icon"></i>
                <h5 class="category-title">Felsefe</h5>
            </div>
        </div>
        <div class="col-lg-1 col-md-1 col-sm-2 mb-2">
            <div class="card category-card">
                <i class="fas fa-paint-brush category-icon"></i>
                <h5 class="category-title">Sanat</h5>
            </div>
        </div>
        <div class="col-lg-1 col-md-1 col-sm-2 mb-2">
            <div class="card category-card">
                <i class="fas fa-child category-icon"></i>
                <h5 class="category-title">Çocuk</h5>
            </div>
        </div>
    </div>
</div>

<!-- Kitap Kartları -->
<div class="container mt-2">
    <div class="row">
        <div class="col-lg-3 col-md-4 col-sm-6 mb-3">
            <div class="card">
                <img src="https://marketplace.canva.com/EAFQE7XNmsw/1/0/1003w/canva-lacivert-minimalist-kelebek-u%C3%A7-kitap-kapa%C4%9F%C4%B1-tpBdl9y5rlw.jpg" class="card-img-top" alt="Kitap 1">
                <div class="card-body">
                    <h5 class="card-title">Kitap 1</h5>
                    <p class="card-text">Bu kitap hakkında kısa bir açıklama yer alacak.</p>
                    <a href="#" class="btn btn-primary">Detaylar</a>
                </div>
            </div>
        </div>
        <!-- Diğer kitap kartlarını buraya ekleyin -->
        <!-- Örnek kartlar -->
        <div class="col-lg-3 col-md-4 col-sm-6">
            <div class="card">
                <img src="https://marketplace.canva.com/EAFH1JlujwI/2/0/1003w/canva-ye%C5%9Fil-sade-gizemli-orman-foto%C4%9Frafl%C4%B1-roman-kitap-kapa%C4%9F%C4%B1-mfPVe9UxMO0.jpg" class="card-img-top" alt="Kitap 2">
                <div class="card-body">
                    <h5 class="card-title">Kitap 2</h5>
                    <p class="card-text">Bu kitap hakkında kısa bir açıklama yer alacak.</p>
                    <a href="#" class="btn btn-primary">Detaylar</a>
                </div>
            </div>
        </div>
        <!-- 10-12 kart için devam edin... -->
    </div>
</div>

<!-- Alt Bar -->
<div class="footer-bar">
    <p>Emre Gündüz | Library</p>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
