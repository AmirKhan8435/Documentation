-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: group14
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booking_service_map_tbl`
--

DROP TABLE IF EXISTS `booking_service_map_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_service_map_tbl` (
  `booking_service_id` int NOT NULL AUTO_INCREMENT,
  `booking_id` int DEFAULT NULL,
  `plumber_service_map_id` int DEFAULT NULL,
  PRIMARY KEY (`booking_service_id`),
  KEY `booking_id` (`booking_id`),
  KEY `plumber_service_map_id` (`plumber_service_map_id`),
  CONSTRAINT `booking_service_map_tbl_ibfk_1` FOREIGN KEY (`booking_id`) REFERENCES `booking_tbl` (`booking_id`),
  CONSTRAINT `booking_service_map_tbl_ibfk_2` FOREIGN KEY (`plumber_service_map_id`) REFERENCES `plumber_service_map_tbl` (`plumber_service_map_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_service_map_tbl`
--

LOCK TABLES `booking_service_map_tbl` WRITE;
/*!40000 ALTER TABLE `booking_service_map_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking_service_map_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booking_tbl`
--

DROP TABLE IF EXISTS `booking_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_tbl` (
  `booking_id` int NOT NULL AUTO_INCREMENT,
  `customer_id` int DEFAULT NULL,
  `work_date` date NOT NULL,
  `work_time` time NOT NULL,
  `work_address` varchar(1000) NOT NULL,
  `work_pincode` int NOT NULL,
  `booking_date` date NOT NULL,
  `booking_status` varchar(100) NOT NULL,
  `booking_total_amount` int NOT NULL,
  PRIMARY KEY (`booking_id`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `booking_tbl_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `customer_info_tbl` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_tbl`
--

LOCK TABLES `booking_tbl` WRITE;
/*!40000 ALTER TABLE `booking_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `booking_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_info_tbl`
--

DROP TABLE IF EXISTS `customer_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_info_tbl` (
  `customer_id` int NOT NULL AUTO_INCREMENT,
  `customer_firstname` varchar(100) NOT NULL,
  `customer_lastname` varchar(100) NOT NULL,
  `customer_username` varchar(100) NOT NULL,
  `customer_password` varchar(200) NOT NULL,
  `customer_address` varchar(100) NOT NULL,
  `customer_pincode` int NOT NULL,
  `customer_email` varchar(200) DEFAULT NULL,
  `customer_phone` int NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_password` (`customer_password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_info_tbl`
--

LOCK TABLES `customer_info_tbl` WRITE;
/*!40000 ALTER TABLE `customer_info_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback_tbl`
--

DROP TABLE IF EXISTS `feedback_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback_tbl` (
  `feedback_id` int NOT NULL AUTO_INCREMENT,
  `booking_service_id` int DEFAULT NULL,
  `punctuality` int DEFAULT NULL,
  `service` int DEFAULT NULL,
  `etiquette` int DEFAULT NULL,
  `price` int DEFAULT NULL,
  `overall` int DEFAULT NULL,
  `review` varchar(2000) DEFAULT NULL,
  `comments` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`feedback_id`),
  KEY `booking_service_id` (`booking_service_id`),
  CONSTRAINT `feedback_tbl_ibfk_1` FOREIGN KEY (`booking_service_id`) REFERENCES `booking_service_map_tbl` (`booking_service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback_tbl`
--

LOCK TABLES `feedback_tbl` WRITE;
/*!40000 ALTER TABLE `feedback_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plumber_info_tbl`
--

DROP TABLE IF EXISTS `plumber_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plumber_info_tbl` (
  `plumber_id` int NOT NULL AUTO_INCREMENT,
  `plumber_firstname` varchar(100) NOT NULL,
  `plumber_lastname` varchar(100) NOT NULL,
  `plumber_username` varchar(100) NOT NULL,
  `plumber_password` varchar(200) NOT NULL,
  `plumber_address` varchar(100) NOT NULL,
  `plumber_pincode` int NOT NULL,
  `plumber_aadhar_no` mediumtext NOT NULL,
  `plumber_email` varchar(200) DEFAULT NULL,
  `plumber_phone` mediumtext NOT NULL,
  `plumber_joindate` date NOT NULL,
  `plumber_photo` blob,
  PRIMARY KEY (`plumber_id`),
  UNIQUE KEY `plumber_password` (`plumber_password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plumber_info_tbl`
--

LOCK TABLES `plumber_info_tbl` WRITE;
/*!40000 ALTER TABLE `plumber_info_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `plumber_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plumber_service_map_tbl`
--

DROP TABLE IF EXISTS `plumber_service_map_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plumber_service_map_tbl` (
  `plumber_service_map_id` int NOT NULL AUTO_INCREMENT,
  `plumber_id` int DEFAULT NULL,
  `service_id` int DEFAULT NULL,
  PRIMARY KEY (`plumber_service_map_id`),
  KEY `plumber_id` (`plumber_id`),
  KEY `service_id` (`service_id`),
  CONSTRAINT `plumber_service_map_tbl_ibfk_1` FOREIGN KEY (`plumber_id`) REFERENCES `plumber_info_tbl` (`plumber_id`),
  CONSTRAINT `plumber_service_map_tbl_ibfk_2` FOREIGN KEY (`service_id`) REFERENCES `service_info_tbl` (`service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plumber_service_map_tbl`
--

LOCK TABLES `plumber_service_map_tbl` WRITE;
/*!40000 ALTER TABLE `plumber_service_map_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `plumber_service_map_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service_info_tbl`
--

DROP TABLE IF EXISTS `service_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `service_info_tbl` (
  `service_id` int NOT NULL AUTO_INCREMENT,
  `service_name` varchar(100) NOT NULL,
  `service_amount` double NOT NULL,
  `service_description` varchar(100) DEFAULT NULL,
  `service_image` blob,
  PRIMARY KEY (`service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `service_info_tbl`
--

LOCK TABLES `service_info_tbl` WRITE;
/*!40000 ALTER TABLE `service_info_tbl` DISABLE KEYS */;
/*!40000 ALTER TABLE `service_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-28 11:07:43
