/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.5.56 : Database - microshopping
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`microshopping` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `microshopping`;

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` char(16) NOT NULL DEFAULT '' COMMENT '账号',
  `password` char(20) NOT NULL DEFAULT '' COMMENT '密码',
  `email` varchar(20) NOT NULL DEFAULT '' COMMENT '邮箱',
  `dataFlag` bit(1) NOT NULL DEFAULT b'0' COMMENT '0无效 1有效 是否有效',
  `isDelete` bit(1) NOT NULL DEFAULT b'0' COMMENT '0未删除 1删除 是否删除',
  `createTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '创建时间',
  `updateTime` datetime NOT NULL DEFAULT '1970-01-01 00:00:00' COMMENT '更新时间',
  `createId` bigint(20) NOT NULL DEFAULT '0' COMMENT '创建人id',
  `updateId` bigint(20) NOT NULL DEFAULT '0' COMMENT '更新人id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`account`,`password`,`email`,`dataFlag`,`isDelete`,`createTime`,`updateTime`,`createId`,`updateId`) values

(1,'18016333986','chen1436863821','cfmmail@sina.com','','\0','2017-12-05 10:36:57','2017-12-05 10:37:01',1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
