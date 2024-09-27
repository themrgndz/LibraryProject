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
	<div class="container mt-4 categories">
		<h2 class="text-center mb-4">Categories</h2>
		<div class="row">
			<div class="col-lg-2 col-md-4 col-sm-6 mb-4">
				<div class="card category-card p-3" onmouseover="changeColor(this)" onmouseout="resetColor(this)">
					<i class="fas fa-book category-icon"></i>
					<h5 class="category-title">Fiction</h5>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-6 mb-4">
				<div class="card category-card p-3" onmouseover="changeColor(this)" onmouseout="resetColor(this)">
					<i class="fas fa-flask category-icon"></i>
					<h5 class="category-title">Science</h5>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-6 mb-4">
				<div class="card category-card p-3" onmouseover="changeColor(this)" onmouseout="resetColor(this)">
					<i class="fas fa-landmark category-icon"></i>
					<h5 class="category-title">History</h5>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-6 mb-4">
				<div class="card category-card p-3" onmouseover="changeColor(this)" onmouseout="resetColor(this)">
					<i class="fas fa-brain category-icon"></i>
					<h5 class="category-title">Philosophy</h5>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-6 mb-4">
				<div class="card category-card p-3" onmouseover="changeColor(this)" onmouseout="resetColor(this)">
					<i class="fas fa-paint-brush category-icon"></i>
					<h5 class="category-title">Art</h5>
				</div>
			</div>
			<div class="col-lg-2 col-md-4 col-sm-6 mb-4">
				<div class="card category-card p-3" onmouseover="changeColor(this)" onmouseout="resetColor(this)">
					<i class="fas fa-child category-icon"></i>
					<h5 class="category-title">Children</h5>
				</div>
			</div>
		</div>
	</div>

	<div class="container">
		<h2>Yeni Eklenenler</h2>
		<div class="row">
			<div class="col-lg-3 col-md-4 col-sm-6 pb-4">
				<div class="card">
					<img src="https://marketplace.canva.com/EAFQE7XNmsw/1/0/1003w/canva-lacivert-minimalist-kelebek-u%C3%A7-kitap-kapa%C4%9F%C4%B1-tpBdl9y5rlw.jpg" class="card-img-top" alt="Kitap 1">
					<div class="card-body">
						<h5 class="card-title">Book 1</h5>
						<p class="card-text">A brief description of this book will appear here.</p>
						<p class="card-text">Remaining stock: 5</p>
						<a href="detail/1" class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-4 col-sm-6 pb-4">
				<div class="card">
					<img src="https://marketplace.canva.com/EAFH1JlujwI/2/0/1003w/canva-ye%C5%9Fil-sade-gizemli-orman-foto%C4%9Frafl%C4%B1-roman-kitap-kapa%C4%9F%C4%B1-mfPVe9UxMO0.jpg" class="card-img-top" alt="Kitap 2">
					<div class="card-body">
						<h5 class="card-title">Book 2</h5>
						<p class="card-text">A brief description of this book will appear here.</p>
						<p class="card-text">Remaining stock: 5</p>
						<a href="detail/2" class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-4 col-sm-6 pb-4">
				<div class="card">
					<img src="https://marketplace.canva.com/EAEe1W_Hods/1/0/1024w/canva-tek-renkli-gerilim-wattpad-kapa%C4%9F%C4%B1-Wcatv-Oosb0.jpg" class="card-img-top" alt="Kitap 3">
					<div class="card-body">
						<h5 class="card-title">Book 3</h5>
						<p class="card-text">A brief description of this book will appear here.</p>
						<p class="card-text">Remaining stock: 5</p>
						<a href="detail/3" class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-4 col-sm-6 pb-4">
				<div class="card">
					<img src="https://static-cse.canva.com/blob/1708256/1024w-Ud9dNR2wsng.jpg" class="card-img-top" alt="Kitap 4">
					<div class="card-body">
						<h5 class="card-title">Book 4</h5>
						<p class="card-text">A brief description of this book will appear here.</p>
						<p class="card-text">Remaining stock: 4</p>
						<a href="detail/4" class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-4 col-sm-6 pb-4">
				<div class="card">
					<img src="https://marketplace.canva.com/EAD51V3O7Hg/1/0/1003w/canva-beyaz-gece-g%C3%B6ky%C3%BCz%C3%BC-otobiyografi-kitap-kapa%C4%9F%C4%B1-byiM1lwz9y0.jpg" class="card-img-top" alt="Kitap 3">
					<div class="card-body">
						<h5 class="card-title">Book 5</h5>
						<p class="card-text">A brief description of this book will appear here.</p>
						<p class="card-text">Remaining stock: 5</p>
						<a href="detail/5" class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-4 col-sm-6 pb-4">
				<div class="card">
					<img src="https://marketplace.canva.com/EAFCpY6Lz2E/1/0/1003w/canva-cad%C4%B1-kitap-kapa%C4%9F%C4%B1-_O41H90NVvU.jpg" class="card-img-top" alt="Kitap 1">
					<div class="card-body">
						<h5 class="card-title">Book 6</h5>
						<p class="card-text">A brief description of this book will appear here.</p>
						<p class="card-text">Remaining stock: 5</p>
						<a href="detail/6" class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-4 col-sm-6 pb-4">
				<div class="card">
					<img src="https://marketplace.canva.com/EAFJV3O0K3o/1/0/1003w/canva-siyah-beyaz-ve-koyu-sar%C4%B1-do%C4%9Fa-hakk%C4%B1nda-roman-i%CC%87ll%C3%BCstrasyon-ve-tipografik-kitap-kapa%C4%9F%C4%B1-h1wRXxi71eg.jpg" class="card-img-top" alt="Kitap 2">
					<div class="card-body">
						<h5 class="card-title">Book 7</h5>
						<p class="card-text">A brief description of this book will appear here.</p>
						<p class="card-text">Remaining stock: 5</p>
						<a href="detail/7" class="btn btn-primary">Details</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<footer class="footer-bar py-3">
	<p class="m-0">© 2023 Uzmar Library. All rights reserved.</p>
</footer>

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js"></script>
</body>
</html>