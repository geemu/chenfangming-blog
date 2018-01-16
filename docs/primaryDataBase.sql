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

/*Table structure for table `blog_employee` */

DROP TABLE IF EXISTS `blog_employee`;

CREATE TABLE `blog_employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userName` varchar(50) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL,
  `headImageUrl` varchar(255) NOT NULL,
  `isDelete` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `blog_employee` */

insert  into `blog_employee`(`id`,`userName`,`password`,`headImageUrl`,`isDelete`) values

  (1,'system','system','系统管理员','\0'),

  (2,'李白','libai','李白的头像url','\0'),

  (3,'杜甫','dufu','杜甫的头像url','\0');

/*Table structure for table `blog_employee_role` */

DROP TABLE IF EXISTS `blog_employee_role`;

CREATE TABLE `blog_employee_role` (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `userId` bigint(20) NOT NULL DEFAULT '0' COMMENT '用户id',
  `roleId` bigint(20) NOT NULL DEFAULT '0' COMMENT '角色id',
  `isDelete` bit(1) DEFAULT b'0' COMMENT '是否删除 0未删除 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `blog_employee_role` */

/*Table structure for table `blog_menu` */

DROP TABLE IF EXISTS `blog_menu`;

CREATE TABLE `blog_menu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `url` varchar(255) NOT NULL DEFAULT '' COMMENT 'url',
  `path` varchar(255) NOT NULL DEFAULT '' COMMENT 'path',
  `compoment` varchar(255) NOT NULL DEFAULT '',
  `name` varchar(20) NOT NULL DEFAULT '' COMMENT '菜单名称',
  `parentId` bigint(20) NOT NULL DEFAULT '0' COMMENT '父菜单id',
  `iconUrl` varchar(255) NOT NULL DEFAULT '' COMMENT '图标链接',
  `requireAuth` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否需要认证 0不需要 1需要',
  `keepAlive` bit(1) NOT NULL DEFAULT b'0',
  `isDelete` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否删除 0未删除 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `blog_menu` */

insert  into `blog_menu`(`id`,`url`,`path`,`compoment`,`name`,`parentId`,`iconUrl`,`requireAuth`,`keepAlive`,`isDelete`) values

  (1,'/','','','所有',0,'','','\0','\0'),

  (2,'/','/home','Home','系统管理',1,'','','\0','\0'),

  (3,'/','/home','Home','统计管理',1,'','','\0','\0'),

  (4,'/','/home','Home','员工资料',1,'','','\0','\0'),

  (5,'/','/home','Home','人事管理',1,'','','\0','\0'),

  (6,'/employee/train/**','/employee/train','EmployeeTrain','员工培训',5,'','','\0','\0'),

  (7,'/employee/basic/**','/employee/basic','EmployeeBasic','基本资料',4,'','','\0','\0'),

  (8,'/employee/advanced/**','/employee/advanced','EmployeeAdvanced','高级资料',4,'','','\0','\0'),

  (9,'/system/data/**','/system/data','SystemData','备份恢复数据库',2,'','','\0','\0'),

  (10,'/system/init/**','/system/init','SystemInit','初始化数据库',2,'','','\0','\0');

/*Table structure for table `blog_menu_role` */

DROP TABLE IF EXISTS `blog_menu_role`;

CREATE TABLE `blog_menu_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `menuId` bigint(20) NOT NULL DEFAULT '0' COMMENT '菜单id',
  `roleId` bit(1) NOT NULL DEFAULT b'0' COMMENT '角色id',
  `isDelete` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否删除 0未删除 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `blog_menu_role` */

/*Table structure for table `blog_role` */

DROP TABLE IF EXISTS `blog_role`;

CREATE TABLE `blog_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `nameEnglish` varchar(50) NOT NULL DEFAULT '' COMMENT '角色英文名称',
  `nameChinese` varchar(50) NOT NULL DEFAULT '' COMMENT '角色中文名称',
  `isDelete` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否删除 0未删除 1删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `blog_role` */

insert  into `blog_role`(`id`,`nameEnglish`,`nameChinese`,`isDelete`) values

  (1,'ROLE_admin','系统管理员','\0'),

  (2,'ROLE_manager','部门经理','\0'),

  (3,'ROLE_train','培训主管','\0');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
