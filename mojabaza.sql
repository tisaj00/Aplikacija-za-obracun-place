drop database if exists mojabaza;
create database mojabaza character set utf8 collate utf8_general_ci;
# mysql -uedunova -pedunova --default_character_set=utf8 < f:\skriptaj19.sql
use mojabaza;

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

create table isplata(
	id 					int not null primary key auto_increment,
	datum				datetime not null,
	naziv_isplate		varchar(100)not null

);

create table placa (
	id 					int not null primary key auto_increment,
	racun_radnika		char(21) not null,
	radnik 				int not null,
	isplata				int not null

);


create table vrsta_primanja (
	id 					int not null primary key auto_increment,
	redovan_rad			char(5) not null,
	nocni_rad			char(5) not null,
	bolovanje 			char(5) not null,
	godisnji 			char(5) not null,
	prekovremeni_rad	char(5) not null
);

create table obracun (
	placa 				int not null,
	vrsta_primanja		int not null
);

alter table placa add foreign key (radnik) references radnik(id);
alter table placa add foreign key (isplata) references isplata(id);

alter table obracun add foreign key (vrsta_primanja) references vrsta_primanja(id);
alter table obracun add foreign key (placa) references placa(id);
