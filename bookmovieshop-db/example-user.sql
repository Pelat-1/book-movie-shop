CREATE USER IF NOT EXISTS 'app_book_movie_shop'@'localhost' IDENTIFIED BY 'sudo';
GRANT ALL PRIVILEGES ON book_movie_shop.* TO 'app_book_movie_shop'@'localhost';