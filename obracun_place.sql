-- MySQL dump 10.16  Distrib 10.1.37-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: obracun_place_hib
-- ------------------------------------------------------
-- Server version	10.1.37-MariaDB


-- # mysql -uedunova -pedunova --default_character_set=utf8 < C:\downloads\Aplikacija-za-obracun-place\ObracunPlace.sql

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `isplata`
--

DROP TABLE IF EXISTS `isplata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `isplata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `datum` date DEFAULT NULL,
  `nazivIsplate` varchar(255) DEFAULT NULL,
  `vrstaIsplate` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `isplata`
--

LOCK TABLES `isplata` WRITE;
/*!40000 ALTER TABLE `isplata` DISABLE KEYS */;
INSERT INTO `isplata` VALUES (2,'2019-04-10','Isplata za srpanj','Redovna'),(3,'2019-04-18','Isplata za Uskrs','Neredovna'),(4,'2018-07-21','Isplata za kolovoz','Redovan'),(5,'2018-12-21','Isplata za Božić','Neredovna');
/*!40000 ALTER TABLE `isplata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `obracun`
--

DROP TABLE IF EXISTS `obracun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `obracun` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kolicinaSati` double NOT NULL,
  `isplata_id` int(11) DEFAULT NULL,
  `radnik_id` int(11) DEFAULT NULL,
  `vrstaPrimanja_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKjclk77fc75w2sgpn2i20xdap8` (`isplata_id`),
  KEY `FK3yvlsu0wuisoth218md1ehllx` (`radnik_id`),
  KEY `FKsq37bl7vsgfnfym9krm8gcokf` (`vrstaPrimanja_id`),
  CONSTRAINT `FK3yvlsu0wuisoth218md1ehllx` FOREIGN KEY (`radnik_id`) REFERENCES `radnik` (`id`),
  CONSTRAINT `FKjclk77fc75w2sgpn2i20xdap8` FOREIGN KEY (`isplata_id`) REFERENCES `isplata` (`id`),
  CONSTRAINT `FKsq37bl7vsgfnfym9krm8gcokf` FOREIGN KEY (`vrstaPrimanja_id`) REFERENCES `vrstaprimanja` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `obracun`
--

LOCK TABLES `obracun` WRITE;
/*!40000 ALTER TABLE `obracun` DISABLE KEYS */;
INSERT INTO `obracun` VALUES (2,8,2,2,4),(3,25,3,7,2),(5,14.5,3,8,3),(6,16,2,1,2);
/*!40000 ALTER TABLE `obracun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operater`
--

DROP TABLE IF EXISTS `operater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operater` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ime` varchar(255) DEFAULT NULL,
  `password` char(60) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operater`
--

LOCK TABLES `operater` WRITE;
/*!40000 ALTER TABLE `operater` DISABLE KEYS */;
INSERT INTO `operater` VALUES (1,'Josip','$2a$10$Acv2gmhmRSMDxb9fcilRte0GT/CM88otNTpWeL4qUDxtdVAwtVIoC','Tisaj','tisaj'),(2,'Adam','$2a$10$Xh9gTq/hvlfkq0yimi/88esI2ajSelv4nykvNrlah4Wu3keLR2fha','Labak','alabak'),(3,'Ivica','$2a$10$aV8JwmamBQd4MULEIdUSk.hlc4IdYAbdLn3X3J/.G2y6BfI9pa7Ny','Ivić','iivic');
/*!40000 ALTER TABLE `operater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `radnik`
--

DROP TABLE IF EXISTS `radnik`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `radnik` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `datumRodenja` date DEFAULT NULL,
  `iban` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `mobitel` varchar(255) DEFAULT NULL,
  `oib` varchar(255) DEFAULT NULL,
  `opcinaPrebivaliste` varchar(255) DEFAULT NULL,
  `osnovicaPoSatu` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `spol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `radnik`
--

LOCK TABLES `radnik` WRITE;
/*!40000 ALTER TABLE `radnik` DISABLE KEYS */;
INSERT INTO `radnik` VALUES (1,'1994-12-14','HR1324020067717646684','Josip','0919340771','81033412708','Beli Manastir','33','Tisaj','M'),(2,'1988-04-07','HR3525000097734752658','Ivica','0926548192','09016664675','Osijek','28,5','Ivić','M'),(3,'1992-07-15','HR1125000099413298126','Ana','2857125015213','28526567799','Valpovo','27','Marić','Ž'),(4,'1977-11-17','HR2223400095331737917','Hrvoje','09876543125','24110568477','Zagreb','30','Mičic','M'),(5,'1966-07-04','HR6523600001248186858','Stjepan','7689650123','49448827503','Split','29','Hujak','M'),(6,'1992-04-09','HR5424020065241365441','Matej','7281421415213','32615223758','Širine','24','Milić','M'),(7,'1987-04-02','HR7523600007575461758','Andrea','098652151223','08198990811','Rijeka','27','Furan','Ž'),(8,'1977-11-26','HR0824020067855636161','Maja','897612515213','29712148642','Pula','29,5','Raguž','Ž'),(9,'1989-01-04','HR3325000094777692271','Helena','0919340771','51575586204','Dubrovnik','29,5','Grujić','Ž'),(10,'1995-01-29','HR2524840089198432784','Filip','21515151321321','45521279456','Beli Manastir','31','Horvat','M');
/*!40000 ALTER TABLE `radnik` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vrstaprimanja`
--

DROP TABLE IF EXISTS `vrstaprimanja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vrstaprimanja` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `koeficijent` decimal(19,2) DEFAULT NULL,
  `nazivVrstePrimanja` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vrstaprimanja`
--

LOCK TABLES `vrstaprimanja` WRITE;
/*!40000 ALTER TABLE `vrstaprimanja` DISABLE KEYS */;
INSERT INTO `vrstaprimanja` VALUES (1,2.90,'Nocni rad'),(2,3.00,'Blagdan'),(3,2.90,'Vikend'),(4,2.00,'Obican');
/*!40000 ALTER TABLE `vrstaprimanja` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-25 23:00:01
