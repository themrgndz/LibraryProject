<!DOCTYPE html>
<html lang="tr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kitap Detay</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
    body {
        background-image: url('https://images.unsplash.com/photo-1713891896907-b1ce4ee8c341?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        background-attachment: fixed;
    }

    .book-cover-wrapper {
        max-width: 100%;
        overflow: hidden;
        border-radius: 20px;
        position: relative;
    }

    .book-cover {
        width: 100%;
        height: auto;
        transition: transform 0.3s ease;
    }

    .book-cover-wrapper:hover .book-cover {
        transform: scale(1.1);
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

    .ana {
        border: solid;
        border-color: #EFEFEF;
        border-radius: 50px;
        background: rgba(0, 0, 0, 0.5);
        backdrop-filter: blur(15px);
        padding: 20px;
        position: relative;
    }

    .ana::before {
        content: '';
        position: absolute;
        top: -20px;
        left: -20px;
        right: -20px;
        bottom: -20px;
        z-index: -1;
        background: linear-gradient(
                rgba(0, 0, 0, 0.5),
                rgba(0, 0, 0, 0.1),
                rgba(0, 0, 0, 0)
        );
        filter: blur(20px);
        border-radius: 50px;
    }
    </style>
</head>
<body>
<div class="container mt-4">
    <div class="text-right mb-3">
        <a href="../anasayfa" class="btn btn-success">Ana Sayfaya Dön</a>
    </div>
    <div class="ana p-4">
        <div class="row">
            <!-- Kitap Kapağı -->
            <div class="col-md-4">
                <div class="book-cover-wrapper">
                    <img src="https://marketplace.canva.com/EAFQE7XNmsw/1/0/1003w/canva-lacivert-minimalist-kelebek-uç-kitap-kapağı-tpBdl9y5rlw.jpg" alt="Kitap Kapağı" class="book-cover">
                </div>
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
                <p>Bu kitap, okuyucuyu derin bir yolculuğa çıkarıyor. Hikaye boyunca karakterler arasındaki ilişkiler ve olaylar sizi etkisi altına alacak...Bu kitap, okuyucuyu derin bir yolculuğa çıkarıyor. Hikaye boyunca karakterler arasındaki ilişkiler ve olaylar sizi etkisi altına alacak...Bu kitap, okuyucuyu derin bir yolculuğa çıkarıyor. Hikaye boyunca karakterler arasındaki ilişkiler ve olaylar sizi etkisi altına alacak...</p>
            </div>
        </div>

        <!-- Benzer Kitaplar -->
        <div class="row mt-5">
            <div class="col-12">
                <h5>Benzer Kitaplar</h5>
            </div>
            <div class="col-md-3 similar-books">
                <div class="book-cover-wrapper">
                    <img src="${resource(dir: 'images', file: '1.jpg')}" alt="Benzer Kitap 1" class="book-cover">
                </div>
                <p class="text-center mt-2">Benzer Kitap 1</p>
            </div>
            <div class="col-md-3 similar-books">
                <div class="book-cover-wrapper">
                    <img src="${resource(dir: 'images', file: '2.jpeg')}" alt="Benzer Kitap 2" class="book-cover">
                </div>
                <p class="text-center mt-2">Benzer Kitap 2</p>
            </div>
            <div class="col-md-3 similar-books">
                <div class="book-cover-wrapper">
                    <img src="${resource(dir: 'images', file: '3.jpeg')}" alt="Benzer Kitap 3" class="book-cover">
                </div>
                <p class="text-center mt-2">Benzer Kitap 3</p>
            </div>
            <div class="col-md-3 similar-books">
                <div class="book-cover-wrapper">
                    <img src="${resource(dir: 'images', file: '5.jpeg')}" alt="Benzer Kitap 4" class="book-cover">
                </div>
                <p class="text-center mt-2">Benzer Kitap 4</p>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
