/*
Navicat MySQL Data Transfer

Source Server         : MySQL55
Source Server Version : 50735
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50735
File Encoding         : 65001

Date: 2021-11-24 11:47:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------

CREATE DATABASE mybatis;
USE    mybatis;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `pwd` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('29', '29', 'sa');
INSERT INTO `user` VALUES ('30', '30', 'sa');
INSERT INTO `user` VALUES ('31', '31', 'sa');
INSERT INTO `user` VALUES ('32', '32', 'sa');
INSERT INTO `user` VALUES ('33', '33', 'sa');
INSERT INTO `user` VALUES ('34', '34', 'sa');
INSERT INTO `user` VALUES ('35', '35', 'sa');
INSERT INTO `user` VALUES ('36', '36', 'sa');
INSERT INTO `user` VALUES ('37', '37', 'sa');
INSERT INTO `user` VALUES ('38', '38', 'sa');
INSERT INTO `user` VALUES ('39', '39', 'sa');
INSERT INTO `user` VALUES ('40', '40', 'sa');
INSERT INTO `user` VALUES ('41', '41', 'sa');
INSERT INTO `user` VALUES ('42', '42', 'sa');
INSERT INTO `user` VALUES ('43', '43', 'sa');
INSERT INTO `user` VALUES ('44', '44', 'sa');
INSERT INTO `user` VALUES ('45', '45', 'sa');
INSERT INTO `user` VALUES ('46', '46', 'sa');
INSERT INTO `user` VALUES ('47', '47', 'sa');
INSERT INTO `user` VALUES ('48', '48', 'sa');
INSERT INTO `user` VALUES ('49', '49', 'sa');
INSERT INTO `user` VALUES ('50', '50', 'sa');
INSERT INTO `user` VALUES ('51', '51', 'sa');
INSERT INTO `user` VALUES ('52', '52', 'sa');
INSERT INTO `user` VALUES ('53', '53', 'sa');
INSERT INTO `user` VALUES ('54', '54', 'sa');
INSERT INTO `user` VALUES ('55', '55', 'sa');
INSERT INTO `user` VALUES ('56', '56', 'sa');
INSERT INTO `user` VALUES ('57', '57', 'sa');
INSERT INTO `user` VALUES ('58', '58', 'sa');
INSERT INTO `user` VALUES ('59', '59', 'sa');
INSERT INTO `user` VALUES ('60', '60', 'sa');
INSERT INTO `user` VALUES ('61', '61', 'sa');
INSERT INTO `user` VALUES ('62', '62', 'sa');
INSERT INTO `user` VALUES ('63', '63', 'sa');
INSERT INTO `user` VALUES ('64', '64', 'sa');
INSERT INTO `user` VALUES ('65', '65', 'sa');
INSERT INTO `user` VALUES ('66', '66', 'sa');
INSERT INTO `user` VALUES ('67', '67', 'sa');
INSERT INTO `user` VALUES ('68', '68', 'sa');
INSERT INTO `user` VALUES ('69', '69', 'sa');
INSERT INTO `user` VALUES ('70', '70', 'sa');
INSERT INTO `user` VALUES ('71', '71', 'sa');
INSERT INTO `user` VALUES ('72', '72', 'sa');
INSERT INTO `user` VALUES ('73', '73', 'sa');
INSERT INTO `user` VALUES ('74', '74', 'sa');
INSERT INTO `user` VALUES ('75', '75', 'sa');
INSERT INTO `user` VALUES ('76', '76', 'sa');
INSERT INTO `user` VALUES ('77', '77', 'sa');
INSERT INTO `user` VALUES ('78', '78', 'sa');
INSERT INTO `user` VALUES ('86', '86', 'sa');
INSERT INTO `user` VALUES ('87', '87', 'sa');
INSERT INTO `user` VALUES ('88', '88', 'sa');
INSERT INTO `user` VALUES ('89', '89', 'sa');
INSERT INTO `user` VALUES ('90', '90', 'sa');
INSERT INTO `user` VALUES ('91', '91', 'sa');
INSERT INTO `user` VALUES ('92', '92', 'sa');
INSERT INTO `user` VALUES ('93', '93', 'sa');
INSERT INTO `user` VALUES ('94', '94', 'sa');
INSERT INTO `user` VALUES ('95', '95', 'sa');
INSERT INTO `user` VALUES ('96', '96', 'sa');
INSERT INTO `user` VALUES ('97', '97', 'sa');
INSERT INTO `user` VALUES ('98', '98', 'sa');
INSERT INTO `user` VALUES ('99', '99', 'sa');
INSERT INTO `user` VALUES ('154', 'guoheng', 'dfc1b985bc618ebbff54d08f3e067bc4');
INSERT INTO `user` VALUES ('155', 'change', 'eb399bcaca686f8609137153307eecf1');
INSERT INTO `user` VALUES ('157', '0207', '5e90ae5f6eb12b3f3e3c86c0409de103');
INSERT INTO `user` VALUES ('158', '2369257907', '260e64f3deae99f3670f0cb33166ff6b');
INSERT INTO `user` VALUES ('159', '0', 'sa');
INSERT INTO `user` VALUES ('160', '张家辉', '689d01368d147a369aa1609990626db1');
