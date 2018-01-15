/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.5.56 : Database - primarydatabase
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`primarydatabase` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `primarydatabase`;

/*Table structure for table `blog_user` */

DROP TABLE IF EXISTS `blog_user`;

CREATE TABLE `blog_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(16) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(50) NOT NULL DEFAULT '' COMMENT '密码',
  `userFace` varchar(255) NOT NULL DEFAULT '' COMMENT '头像链接',
  `remark` varchar(200) NOT NULL DEFAULT '' COMMENT '备注',
  `isDelete` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否删除 0未删除 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `blog_user` */

insert  into `blog_user`(`id`,`userName`,`password`,`userFace`,`remark`,`isDelete`) values
(1,'admin','admin','','admin','\0'),
(2,'custom','custom','','custom','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
