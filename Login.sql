drop database if exists login;
create database login character set utf8 collate utf8_general_ci;
# mysql -uedunova -pedunova --default_character_set=utf8 < D:\Tečaj\Aplikacija-za-obracun-place\Login.sql
use login;

create table ObracunPlaceLogin (
	id int(10) not null primary key auto_increment,
	username varchar(50) not null,
	password varchar(50) not null
);	

