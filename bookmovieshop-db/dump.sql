CREATE DATABASE IF NOT EXISTS book_movie_shop;

-- GRANT ALL on user

USE book_movie_shop;

create table if not exists bms_user (
	id int NOT NULL auto_increment,
    firstname varchar(32),
    lastname varchar(32),
    email varchar(320) NOT NULL,
    password varchar(60) NOT NULL,
    address varchar(100),
    birthday date,
    registration_date datetime(3) NOT NULL,
    PRIMARY KEY(id),
    CONSTRAINT email_unique UNIQUE(email)
);
-- completare la create basandosi sulla classe UserEntity