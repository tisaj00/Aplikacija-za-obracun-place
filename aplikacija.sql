drop database if exists aplikacija;
create database aplikacija character set utf8 collate utf8_general_ci;
# mysql -uedunova -pedunova --default_character_set=utf8 < D:\Tečaj\mojaapp\aplikacija.sql
use aplikacija;

create table radnik (
	id 					int not null primary key auto_increment,
	oib					char(11) null,
	ime					varchar(50)	not null,
	prezime				varchar(50) not null,
	spol				boolean not null,
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
	koeficijent			decimal(5,1) not null
);

create table obracun (
	isplata 			int not null,
	vrsta_primanja		int not null,
	kolicina_sati		int(10) not null
);

alter table isplata add foreign key (radnik) references radnik(id);

alter table obracun add foreign key (vrsta_primanja) references vrsta_primanja(id);
alter table obracun add foreign key (isplata) references isplata(id);

insert into radnik (id,oib,ime,prezime,spol,datum_rodenja,mobitel,osnovica_po_satu,opcina_prebivalista) values
(null,null,'Mato','Pavić',true,'1980-7-15',0918724590,4,'Beli Manastir'),
(null,67682145721,'Marija','Herić',false,'1977-2-14',null,6,'Valpovo'),
(null,42357912562,'Josip','Ivić',true,'1967-9-18',0985698517,2,'Osijek'),
(null,87524901728,'Marina','Pirić',false,'1982-12-12',0956874239,3,'Petrijevci');

insert into isplata (id,racun_radnika,radnik,datum,naziv_isplate) values 
(null,'HR2596874236915896348',1,'2017-4-15','Isplata za mjesec ožujak'),
(null,'HR6973265543109876358',2,'2017-6-15','Isplata za mjesec svibanj'),
(null,'HR6978532260149638752',3,'2017-8-16','Isplata za mjesec srpanj'),
(null,'HR3675239684210367852',4,'2017-12-13','Isplata za mjesec studeni');

insert into vrsta_primanja (id,vrijednost,koeficijent) values 
(null,'Redovan rad,Godišnji odmor,Nočni rad',1.8),
(null,'Redovan rad,Trudnicki,Bolovanje',1.2),
(null,'Redovan rad,Bolovanje',1.5),
(null,'Reovan rad,Prekovremeni rad,Nočni rad',2.2);

insert into obracun (isplata,vrsta_primanja,kolicina_sati) values
(1,1,150),
(2,2,110),
(3,3,125),
(4,4,189);


