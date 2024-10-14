<!DOCTYPE html>
<html lang="tr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${bookInstance.title} - Book Detail</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
    body {
        background-image: url('https://images.unsplash.com/photo-1713891896907-b1ce4ee8c341?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
        background-size: cover;
        background-position: center;
        background-repeat: no-repeat;
        background-attachment: fixed;
        color: #EFEFEF;
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


    .stock-info {
        font-size: 45px;
        font-weight: bold;
        color: #EFEFEF;
    }

    .stock-label {
        font-size: 40px;
        font-weight: bold;
    }
    </style>
</head>
<body>
<div class="container mt-4">
    <div class="text-right mb-3">
        <a href="${createLink(controller: 'home', action: 'homepage')}" class="btn btn-success">Return to homepage</a>
    </div>
    <div class="ana p-4">
        <div class="row">
            <div class="col-md-4">
                <div class="book-cover-wrapper">
                    <img src="${bookInstance.image_url}" alt="${bookInstance.title} Cover" class="book-cover">
                </div>
                <button class="btn btn-outline-warning mt-3 w-100">Favorite</button>
                <button class="btn btn-outline-success mt-2 w-100">Borrow</button>
            </div>

            <div class="col-md-8">
                <h2>${bookInstance.title}</h2>
                <div class="row align-items-center">
                    <div class="col">
                        <p class="text-muted">Author: <strong>${bookInstance.author}</strong></p>
                        <p class="book-details">Publisher: <strong>${bookInstance.publisher}</strong></p>
                        <p class="book-details">Publication Year: <strong>${bookInstance.publicationYear}</strong></p>
                        <p class="book-details">Page Count: <strong>${bookInstance.pageCount}</strong></p>
                        <p class="book-details">Language: <strong>${bookInstance.language}</strong></p>
                        <p class="book-details">Category: <strong>${bookInstance.category}</strong></p>
                        <p class="book-details">ISBN: <strong>${bookInstance.isbn}</strong></p>
                    </div>
                    <div class="col">
                        <p class="text-center stock-label"><strong>Stock Count</strong></p>
                        <p class="text-center stock-info"><strong>${bookInstance.stock}</strong></p>
                    </div>
                </div>
                <h5 class="mt-4">Description</h5>
                <p>${bookInstance.description}</p>
            </div>
        </div>

        <div class="row mt-5">
            <div class="col-12">
                <h5>Similar Books</h5>
            </div>

            <g:each in="${similarBooks}" var="similarBook">
                <div class="col-md-3 similar-books">
                    <div class="book-cover-wrapper">
                        <a href="${createLink(controller: 'book', action: 'detail', id: similarBook.id)}">
                            <img src="${similarBook.image_url}" alt="${similarBook.title} Cover" class="book-cover">
                        </a>
                    </div>
                </div>
            </g:each>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
