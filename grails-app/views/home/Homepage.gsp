<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Library Homepage</title>
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
		color: black;
	}
	.category-card {
		text-align: center;
		border: none;
		transition: transform 0.3s ease, box-shadow 0.3s ease, color 0.3s ease;
		border-radius: 10px;
		background-color: rgba(0, 0, 0, 0.5);
		color: white;
	}
	.category-card:hover {
		transform: scale(1.15);
		box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
	}
	.category-icon {
		font-size: 3rem;
		color: inherit;
		margin-bottom: 15px;
	}
	.category-title {
		font-size: 1.2rem;
		font-weight: bold;
	}
	.main {
		background-color: rgb(0, 0, 0, 0.5);
		padding-top: 10px;
		padding-bottom: 2%;
		border-radius: 50px;
	}
	.card {
		transition: transform 0.4s ease, box-shadow 0.4s ease;
		transform-style: preserve-3d;
		perspective: 1000px;
		background-color: #16191b!important;
	}
	.card:hover {
		transform: scale(1.1);
		box-shadow: 0 15px 30px rgba(0, 0, 0, 0.5);
	}
	.card img {
		height: 500px;
		width: 100%;
		object-fit: cover;
		object-position: center;
		border-radius: 10px;
	}
	.card-body {
		cursor: pointer;
	}
	</style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand mx-3" href="./homepage">Uzmar Library</a>

		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarNav">
			<form class="d-flex ms-auto" role="search">
				<input class="form-control me-2" type="search" placeholder="Search for Book / Author" aria-label="Search" style="width: 400px">
				<button class="btn btn-outline-success" type="submit">Search</button>
			</form>
			<ul class="navbar-nav ms-auto">
				<li class="nav-item">
					<a class="nav-link btn btn-outline-success mx-2" href="./profile">Profile</a>
				</li>
				<li class="nav-item">
					<a class="nav-link btn btn-outline-danger mx-2" href="./">Logout</a>
				</li>
			</ul>
		</div>
	</div>
</nav>

<div class="container main">
	<div class="container">
		<div class="row">
		<!-- Kitapları dinamik olarak oluşturuyoruz -->
			<g:each in="${bookInstanceList}" var="book">
				<div class="col-lg-3 col-md-4 col-sm-6 pb-4">
					<a href="detail/${book.id}" class="text-decoration-none">
						<div class="card bg-dark text-light">
							<img src="${book.image_url}" class="card-img-top" alt="${book.title}">
							<div class="card-body">
								<h5 class="card-title text-light">${book.title}</h5>
								<p class="card-text text-light">${book.description}</p>
								<p class="card-text text-light">Remaining stock: ${book.stock}</p>
							</div>
						</div>
					</a>
				</div>
			</g:each>
		</div>
	</div>
</div>

<footer class="footer-bar py- bg-dark text-light">
	<p class="m-0">© 2023 Uzmar Library. All rights reserved.</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"></script>
</body>
</html>
