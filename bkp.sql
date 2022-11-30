CREATE DATABASE  IF NOT EXISTS `quiz1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `quiz1`;
-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: quiz1
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `histórico`
--

DROP TABLE IF EXISTS `histórico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `histórico` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idUsuário` int DEFAULT NULL,
  `idJogosSalvos` int DEFAULT NULL,
  `acertos` int DEFAULT NULL,
  `erros` int DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idUsuário` (`idUsuário`),
  CONSTRAINT `histórico_ibfk_1` FOREIGN KEY (`idUsuário`) REFERENCES `histórico` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `histórico`
--

LOCK TABLES `histórico` WRITE;
/*!40000 ALTER TABLE `histórico` DISABLE KEYS */;
/*!40000 ALTER TABLE `histórico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jogossalvos`
--

DROP TABLE IF EXISTS `jogossalvos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jogossalvos` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jogossalvos`
--

LOCK TABLES `jogossalvos` WRITE;
/*!40000 ALTER TABLE `jogossalvos` DISABLE KEYS */;
/*!40000 ALTER TABLE `jogossalvos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perguntas`
--

DROP TABLE IF EXISTS `perguntas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perguntas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Questão` longtext,
  `A` text,
  `B` text,
  `C` text,
  `D` text,
  `OpçãoCerta` varchar(2) DEFAULT NULL,
  `Tema` varchar(100) DEFAULT NULL,
  `Dificuldade` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perguntas`
--

LOCK TABLES `perguntas` WRITE;
/*!40000 ALTER TABLE `perguntas` DISABLE KEYS */;
INSERT INTO `perguntas` VALUES (1,'Quanto é 50 + 50?','300','400','100','50','C','Matemática','Fácil'),(2,'Quanto é 200 + 200?','150','400','350','500','B','Matemática','Fácil'),(3,'Quanto é raiz quadrada de 81?','9','15','12','4','A','Matemática','Média'),(4,'Quanto é -50 + 20?','-70','70','30','-30','D','Matemática','Média'),(5,'Quanto é 30 * 30?','700','1000','900','560','C','Matemátiva','Difícil'),(6,'Quanto é 125 + 24?','165','149','200','150','B','Matemática','Difícil'),(7,'Qual o time que têm a torcda conhecida como \"Gaviões da Fiel\"?','Coritiba','Flamengo','Corinthians','Palmeiras','C','Futebol','Fácil'),(8,'Qual o atual time que o Messi joga?','PSG','Barcelona','Manchester City','Arsenal','A','Futebol','Fácil'),(9,'Quantas bolas de ouro Messi têm?','7','8','9','5','B','Futebol','Média'),(10,'Qual jogador de futebol bateu o recorde de 91 gols em apenas 1 temporada?','Neymar Jr','Ronaldinho Gaúcho','Cristiano Ronaldo','Lionel Messi','D','Futebol','Média'),(11,'Em que time joga Vinícius Júnior?','Real Madrid','Chelsea','Manchester United','Tottenham','A','Futebol','Difícil'),(12,'Como são chamados os torcedores do Barcelona?','Merengues','Red Devils','Culé','Citizens','C','Futebol','Difícil');
/*!40000 ALTER TABLE `perguntas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `posições`
--

DROP TABLE IF EXISTS `posições`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `posições` (
  `id` int NOT NULL AUTO_INCREMENT,
  `pontosTotais` int DEFAULT NULL,
  `idUsuário` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `posições`
--

LOCK TABLES `posições` WRITE;
/*!40000 ALTER TABLE `posições` DISABLE KEYS */;
/*!40000 ALTER TABLE `posições` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questõesusadas`
--

DROP TABLE IF EXISTS `questõesusadas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questõesusadas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `idPergunta` int DEFAULT NULL,
  `idJogosSalvos` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questõesusadas`
--

LOCK TABLES `questõesusadas` WRITE;
/*!40000 ALTER TABLE `questõesusadas` DISABLE KEYS */;
/*!40000 ALTER TABLE `questõesusadas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `senha` int DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-30 19:53:50
