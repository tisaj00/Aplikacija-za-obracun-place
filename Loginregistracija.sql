drop database if exists loginregistracija;
create database loginregistracija character set utf8 collate utf8_general_ci;
# mysql -uedunova -pedunova --default_character_set=utf8 < D:\Tečaj\Aplikacija-za-obracun-place\loginregistracija.sql
use loginregistracija;

create table logreg (
	id int(10) not null primary key auto_increment,
	ime varchar(50) not null,
	prezime varchar(50) not null,
	username varchar(100) not null,
	password varchar(100) not null,
	repassword varchar(100) not null,
	datumrodenja date
);	

