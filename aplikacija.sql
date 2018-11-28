drop database if exists aplikacija;
create database aplikacija character set utf8 collate utf8_general_ci;
# mysql -uedunova -pedunova --default_character_set=utf8 < f:\skriptaj19.sql
use aplikacija;

create table radnik (
	id 					int not null primary key auto_increment,
	oib					char(11) null,
	ime					varchar(50)	not null,
	prezime				varchar(50) not null,
	spol				char(1) not null,
	datum_rodenja		datetime not null,
	mobitel				char(10) null,
	osnovica_po_satu 	int not null,
	opcina_prebivalista	varchar(100) not null
);	

create table isplata (
	id 					int not null primary key auto_increment,
	racun_radnika		char(21) not null,
	radnik 				int not null,
	datum				datetime not null,
	naziv_isplate		varchar(100)not null

);

create table vrsta_primanja (
	id 					int not null primary key auto_increment,
	vrijednost			varchar(100) not null,
	koeficijent			int(5) not null
);

create table obracun (
	isplata 			int not null,
	vrsta_primanja		int not null,
	kolicina_sati		int(10) not null
);

alter table isplata add foreign key (radnik) references radnik(id);

alter table obracun add foreign key (vrsta_primanja) references vrsta_primanja(id);
alter table obracun add foreign key (isplata) references isplata(id);
