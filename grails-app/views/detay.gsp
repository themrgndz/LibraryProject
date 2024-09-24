<!DOCTYPE html>
<html lang="tr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kitap Detay</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
    .book-cover {
        max-width: 100%;
        height: auto;
    }
    .rating {
        color: gold;
    }
    .btn-custom {
        background-color: #007bff;
        color: white;
    }
    .book-details {
        font-size: 14px;
        color: #6c757d;
    }
    .similar-books img {
        width: 100%;
        height: auto;
    }
    </style>
</head>
<body>
<div class="container mt-5">
    <div class="row">
        <!-- Kitap Kapağı -->
        <div class="col-md-4">
            <img src="assets/images/book-cover.jpg" alt="Kitap Kapağı" class="book-cover">
            <button class="btn btn-custom mt-3 w-100">Favorilere Ekle</button>
            <button class="btn btn-outline-secondary mt-2 w-100">Ödünç Al</button>
        </div>

        <!-- Kitap Bilgileri -->
        <div class="col-md-8">
            <h2>Kitap İsmi</h2>
            <p class="text-muted">Yazar: <strong>Yazar İsmi</strong></p>

            <p class="book-details">Yayınevi: <strong>Yayınevi Adı</strong></p>
            <p class="book-details">Yayın Yılı: <strong>2023</strong></p>
            <p class="book-details">Sayfa Sayısı: <strong>320</strong></p>
            <p class="book-details">Dil: <strong>Türkçe</strong></p>
            <p class="book-details">Kategori: <strong>Roman</strong></p>
            <p class="book-details">ISBN: <strong>1234567890123</strong></p>

            <h5 class="mt-4">Açıklama</h5>
            <p>Bu kitap, okuyucuyu derin bir yolculuğa çıkarıyor. Hikaye boyunca karakterler arasındaki ilişkiler ve olaylar sizi etkisi altına alacak...</p>

            <!-- Yorumlar -->
            <h5 class="mt-4">Kullanıcı Yorumları</h5>
            <div class="d-flex">
                <div class="rating">
                    ★★★★☆
                </div>
                <p class="ml-3">(15 yorum)</p>
            </div>
            <button class="btn btn-outline-primary">Yorum Yap</button>
        </div>
    </div>

    <!-- Benzer Kitaplar -->
    <div class="row mt-5">
        <div class="col-12">
            <h5>Benzer Kitaplar</h5>
        </div>
        <div class="col-md-3 similar-books">
            <img src="assets/images/similar-book1.jpg" alt="Benzer Kitap 1">
            <p class="text-center mt-2">Benzer Kitap 1</p>
        </div>
        <div class="col-md-3 similar-books">
            <img src="assets/images/similar-book2.jpg" alt="Benzer Kitap 2">
            <p class="text-center mt-2">Benzer Kitap 2</p>
        </div>
        <div class="col-md-3 similar-books">
            <img src="assets/images/similar-book3.jpg" alt="Benzer Kitap 3">
            <p class="text-center mt-2">Benzer Kitap 3</p>
        </div>
        <div class="col-md-3 similar-books">
            <img src="assets/images/similar-book4.jpg" alt="Benzer Kitap 4">
            <p class="text-center mt-2">Benzer Kitap 4</p>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
