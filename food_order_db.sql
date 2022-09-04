-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: food_order_db
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `food_id` int NOT NULL,
  `user_id` int NOT NULL,
  `created_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_comment_food_idx` (`food_id`),
  KEY `fk_comment_user_idx` (`user_id`),
  CONSTRAINT `fk_comment_food` FOREIGN KEY (`food_id`) REFERENCES `food` (`id`),
  CONSTRAINT `fk_comment_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,'Bún bò chuẩn vị Huế',1,2,'2021-11-09 00:00:00'),(2,'Cơm tấm ngon, nhân viên phục vụ tốt',5,2,'2022-01-09 00:00:00'),(3,'Chả không tanh , bánh mì đặc ruột, ngon khi ăn với nước mắm',2,2,'2022-03-23 00:00:00');
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` int NOT NULL,
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Hằng','Nguyễn Trương Kim ','HangNguyenTruong@gmail.com',979868685,'77,Hoàng Diệu 2, Linh Trung, Thủ Dức '),(2,'Bình','Chắng Lý','Binhchangly@gmail.com',975464456,'93, Dân Chủ, Bình Thọ, Thủ Đức'),(3,'Minh','Đỗ Văn','Minh3432425@gmail.com',878675756,'Thái Bình'),(4,'Hậu','Hoàng Thái','Hauhoang342@gmail.com',897678565,'Bình Định');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food`
--

DROP TABLE IF EXISTS `food`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `upload_time` datetime DEFAULT NULL,
  `decription` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `image` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `unit_price` decimal(10,0) DEFAULT '0',
  `status` tinyint NOT NULL,
  `category` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `restaurant_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_food_restaurant_idx` (`restaurant_id`),
  CONSTRAINT `fk_food_restaurant` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food`
--

LOCK TABLES `food` WRITE;
/*!40000 ALTER TABLE `food` DISABLE KEYS */;
INSERT INTO `food` VALUES (1,'Bún bò Huế','2021-08-30 00:00:00','Ngon','https://trivietphat.net/wp-content/uploads/2021/08/bun-bo-1.jpg',45000,1,'Bún',5),(2,'Bánh mì chả cá','2022-01-30 00:00:00','chả cá ăn vào bị bột','https://xebanhmithonhiky.vn/wp-content/uploads/2020/07/banh-mi-cha-ca.jpg',20000,1,'Bánh mì',6),(4,'Cơm gà luộc','2022-08-12 00:00:00','Gà giòn, không bột, thả vườn','https://i-giadinh.vnecdn.net/2021/01/29/com2-1611892464-7028-1611892596.jpg',35000,1,'Cơm',1),(5,'Cơm tấm','2022-04-08 00:00:00','Hạt dẻo, sườn nướng mật ong','https://cdn.beptruong.edu.vn/wp-content/uploads/2018/06/cach-uop-thit-nuong-com-tam.jpg',45000,0,'Cơm',2),(6,'Bánh mì nướng muối ớt','2022-07-24 00:00:00','Bao thấm, bao ngon','http://cdn.tgdd.vn/Files/2019/02/27/1152127/lam-banh-mi-nuong-muoi-ot-gion-thom-nuc-mui-202110301055149823.jpg',15000,1,'Bánh mì',7),(7,'Bánh cuốn chả ram','2022-09-04 00:00:00','Nhiều nhân tôm thịt, rau ăn kèm','https://cdn.beptruong.edu.vn/wp-content/uploads/2018/06/cach-uop-thit-nuong-com-tam.jpg',49000,1,'Ăn vặt',1);
/*!40000 ALTER TABLE `food` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_order`
--

DROP TABLE IF EXISTS `food_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food_order` (
  `id` int NOT NULL AUTO_INCREMENT,
  `amount` decimal(10,0) NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `payment` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `customer_id` int NOT NULL,
  `restaurant_id` int NOT NULL,
  `is_delete` bit(1) DEFAULT b'1',
  PRIMARY KEY (`id`),
  KEY `fk_foodorder_customer_idx` (`customer_id`),
  KEY `fk_foodorder_restaurant_idx` (`restaurant_id`),
  CONSTRAINT `fk_foodorder_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `fk_foodorder_restaurant` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_order`
--

LOCK TABLES `food_order` WRITE;
/*!40000 ALTER TABLE `food_order` DISABLE KEYS */;
INSERT INTO `food_order` VALUES (1,3,'2022-02-08 00:00:00','MoMo',1,1,_binary ''),(2,1,'2022-07-01 00:00:00','Zalo Pay',2,1,_binary ''),(3,4,'2021-03-06 00:00:00','Shopee Pay',3,6,_binary ''),(4,2,'2019-12-23 00:00:00','Zalo Pay',4,6,_binary '');
/*!40000 ALTER TABLE `food_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `food_order_detail`
--

DROP TABLE IF EXISTS `food_order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `food_order_detail` (
  `id` int NOT NULL AUTO_INCREMENT,
  `total_price` decimal(10,0) NOT NULL,
  `ship_price` decimal(10,0) NOT NULL,
  `created_date` datetime DEFAULT NULL,
  `sell_time` datetime DEFAULT NULL,
  `food_quantity` int DEFAULT NULL,
  `order_id` int NOT NULL,
  `food_id` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_id_UNIQUE` (`order_id`),
  KEY `fk_orderDetail_food_idx` (`food_id`),
  CONSTRAINT `fk_orderDetail_food` FOREIGN KEY (`food_id`) REFERENCES `food` (`id`),
  CONSTRAINT `fk_orderDetail_foodorder` FOREIGN KEY (`order_id`) REFERENCES `food_order` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_order_detail`
--

LOCK TABLES `food_order_detail` WRITE;
/*!40000 ALTER TABLE `food_order_detail` DISABLE KEYS */;
INSERT INTO `food_order_detail` VALUES (1,90000,15000,'2021-06-12 00:00:00','2021-07-23 00:00:00',2,1,1),(2,40000,15000,'2019-12-23 00:00:00','2020-12-23 00:00:00',3,3,2),(5,30000,15000,'2022-07-03 00:00:00','2022-07-04 00:00:00',2,4,4);
/*!40000 ALTER TABLE `food_order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `restaurant_id` int NOT NULL,
  `food_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_menu_restaurant_idx` (`restaurant_id`),
  KEY `fk_menu_food_idx` (`food_id`),
  CONSTRAINT `fk_menu_food` FOREIGN KEY (`food_id`) REFERENCES `food` (`id`),
  CONSTRAINT `fk_menu_restaurant` FOREIGN KEY (`restaurant_id`) REFERENCES `restaurant` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `restaurant`
--

DROP TABLE IF EXISTS `restaurant`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `restaurant` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `user_id` int NOT NULL,
  `created_date` datetime NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_restaurant_user_idx` (`user_id`),
  CONSTRAINT `fk_restaurant_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `restaurant`
--

LOCK TABLES `restaurant` WRITE;
/*!40000 ALTER TABLE `restaurant` DISABLE KEYS */;
INSERT INTO `restaurant` VALUES (1,'Cơm gà Ngon',1,'2022-02-02 00:00:00','Gà ăn vô tư','https://vntopfood.com/wp-content/uploads/2022/07/com-ga-Phu-Quoc.jpg'),(2,'Cơm tấm Phúc Lộc Thọ',2,'2022-01-01 00:00:00','Quán nướng thịt ngon','https://cafebiz.cafebizcdn.vn/zoom/700_438/162123310254002176/2021/2/19/photo1613668692054-1613668692418416660680-16136687715501020583665.jpg'),(3,'Bún chả cá Hoàng',3,'2022-03-03 00:00:00','Bún tươi, chả cá ngon','https://cdn.cet.edu.vn/wp-content/uploads/2018/09/bun-cha-ca-nha-trang.jpg'),(4,'Bánh mì heo quay Hà',4,'2022-04-04 00:00:00','Thịt heo giòn','https://cdn.tgdd.vn/Files/2021/09/06/1380700/cach-lam-banh-mi-heo-quay-thom-ngon-cho-bua-sang-dinh-duong-202201110134135409.jpg'),(5,'Bún bò Huế Bà Mười',5,'2021-12-08 00:00:00','Bún bò chuẩn Huế','https://file.hstatic.net/200000395159/article/nau-bun-bo-hue-chuan-vi-tai-nha-voi-cot-co-dac-quoc-viet-foods_59b7ba1543004e67967af718d8afc32b.jpg'),(6,'Bánh mì chả cá Út Nguyên',10,'2021-03-30 00:00:00','Quán có view bao đẹp, mời bạn ăn nha!!','https://noiphodien123.vn/wp-content/uploads/2021/05/cach-lam-banh-mi-cha-ca-nha-trang.jpg'),(7,'Bánh mì nướng muối ớt Thảo',9,'2022-03-07 00:00:00','bánh mì bao giòn ngon','https://bepxua.vn/wp-content/uploads/2020/08/banh-mi-nuong-muoi-ot-ngon.jpg');
/*!40000 ALTER TABLE `restaurant` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `full_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `phone` varchar(12) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `user_role` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `avatar` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `is_active` bit(1) DEFAULT b'1',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_UNIQUE` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Nguyen Trong Nhan','admin','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','1951052140nhan@ou.edu.vn','0877978865','ADMIN','https://i.pinimg.com/564x/a7/e0/ea/a7e0eaa86177194cf7d9a28e8685244a.jpg',_binary ''),(2,'Nguyen Thi An','user1','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','12314343412A@ou.edu.vn','0788757463','USER','https://cdn.eva.vn/upload/3-2021/images/2021-09-24/image1-1632448500-758-width650height520.jpg',_binary ''),(3,'Nguyen Quang Minh','user2','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','nguyenquangminh@gmail.com','0797865756','USER','https://huanluyenchosieutoc.com/wp-content/uploads/2019/09/bang-bao-gia-huan-luyen-cho-Boo-3.jpg',_binary ''),(4,'Nguyen Thi Minh Khai','restaurant1','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','minhkhaii@gmail.com','0877856545','RESTAURANT','https://cdn.eva.vn/upload/3-2021/images/2021-09-24/image1-1632448500-758-width650height520.jpg',_binary ''),(5,'Tran Thi Thu','restaurant2','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','thutran@gmail.com','0123456789','RESTAURANT','https://cdn.eva.vn/upload/3-2021/images/2021-09-24/image1-1632448500-758-width650height520.jpg',_binary ''),(6,'Nguyễ Thị Thúy Vi','restaurant3','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','Vicute34245@hmail.com','0789686756','RESTAURANT','http://redsvn.net/wp-content/uploads/2014/07/Redsvn-Meo-ca-07.jpg',_binary ''),(7,'Quách Tuấn Hiền','restaurant5','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','shawn454@gmail.com','078867856','RESTAURANT','https://icdn.dantri.com.vn/thumb_w/660/2021/09/08/316784x441-1631079051594.jpg',_binary ''),(8,'Nguyễn Thị Bích Hồng','restaurant6','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','keryy564@gmail.com','0878567574','RESTAURANT','https://mcdn.coolmate.me/uploads/December2021/do-mac-cho-meo_1.jpg',_binary ''),(9,'Đỗ Khánh Hân','Restaurant7','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','hankhanh4334@gmail.com','089785476','RESTAURANT','https://gamek.mediacdn.vn/133514250583805952/2022/3/21/photo-1-16478519683281481122872.jpg',_binary ''),(10,'Phan lê Thái An\n','Restaurant8','$2a$10$ZNKZiHFayy1cey09bcP0KOYH5HzV7m43SQb5nlxNwJCWpnmki9gVS','Anple234@gmail.com','08796855','RESTAURANT','https://image.vtc.vn/resize/th/upload/2022/03/30/dang-yeu-14130933.jpg',_binary '');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-04 11:37:05
