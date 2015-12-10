/*
Navicat MySQL Data Transfer

Source Server         : smartdevice
Source Server Version : 50610
Source Host           : localhost:3306
Source Database       : smartdevice

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2015-12-10 10:28:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `appinfo`
-- ----------------------------
DROP TABLE IF EXISTS `appinfo`;
CREATE TABLE `appinfo` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `APPNAME` varchar(50) NOT NULL,
  `PUBLISHER` varchar(100) NOT NULL,
  `PUBTIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `PICTURE` varchar(200) NOT NULL,
  `PATH` varchar(200) NOT NULL,
  `DEVICETYPE` varchar(50) NOT NULL,
  `DESCRIPTION` text,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appinfo
-- ----------------------------
INSERT INTO `appinfo` VALUES ('1', 'smartcar', 'zhai', '2015-12-09 14:54:47', 'E:	est', 'E:	est', 'car', 'test');
INSERT INTO `appinfo` VALUES ('2', 'smartcar', 'zhai', '2015-12-09 14:54:54', 'E:	est', 'E:	est', 'car', 'test');
INSERT INTO `appinfo` VALUES ('3', 'smartcar', 'zhai', '2015-12-09 14:54:55', 'E:	est', 'E:	est', 'car', 'test');
INSERT INTO `appinfo` VALUES ('4', 'smartcar', 'zhai', '2015-12-09 14:57:31', 'E:	est', 'E:	est', 'car', 'test');
