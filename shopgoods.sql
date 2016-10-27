/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : shopgoods

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2016-10-27 19:53:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `categoryno` int(11) NOT NULL AUTO_INCREMENT,
  `categoryname` varchar(20) NOT NULL,
  PRIMARY KEY (`categoryno`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('1', '衣服');
INSERT INTO `category` VALUES ('2', '裤子');
INSERT INTO `category` VALUES ('3', '运动');
INSERT INTO `category` VALUES ('4', '清洁用品');
INSERT INTO `category` VALUES ('6', '服饰');
INSERT INTO `category` VALUES ('7', '家具');
INSERT INTO `category` VALUES ('8', '生活');
INSERT INTO `category` VALUES ('77', '电子产品');
INSERT INTO `category` VALUES ('78', '文具用品');
INSERT INTO `category` VALUES ('79', '护理用品');

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodsno` int(11) NOT NULL AUTO_INCREMENT,
  `goodsname` varchar(20) NOT NULL,
  `goodsprice` double(20,2) NOT NULL,
  `categoryno` int(11) NOT NULL,
  `goodsdate` date NOT NULL,
  `goodswarranty` int(6) DEFAULT '999999' COMMENT '// 默认没有保质期',
  PRIMARY KEY (`goodsno`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '篮球', '80.00', '3', '2016-10-25', '999999');
INSERT INTO `goods` VALUES ('2', '足球', '120.00', '3', '2016-10-25', '999999');
INSERT INTO `goods` VALUES ('26', '排球', '90.23', '3', '2007-12-12', '999999');
INSERT INTO `goods` VALUES ('27', '牛仔裤', '70.50', '2', '2015-12-23', '12');
