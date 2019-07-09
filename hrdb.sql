/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50549
Source Host           : localhost:3306
Source Database       : hrdb

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2019-07-09 19:23:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept_inf
-- ----------------------------
DROP TABLE IF EXISTS `dept_inf`;
CREATE TABLE `dept_inf` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `remark` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept_inf
-- ----------------------------
INSERT INTO `dept_inf` VALUES ('1', '财务部', '无');
INSERT INTO `dept_inf` VALUES ('2', '学术部', '无');
INSERT INTO `dept_inf` VALUES ('3', '公关部', '无');
INSERT INTO `dept_inf` VALUES ('4', '科技部', '无');
INSERT INTO `dept_inf` VALUES ('5', '天文部', '无');
INSERT INTO `dept_inf` VALUES ('6', '建设部', '无');
INSERT INTO `dept_inf` VALUES ('7', '测试', '测试');
INSERT INTO `dept_inf` VALUES ('8', '员工', '1');

-- ----------------------------
-- Table structure for employee_inf
-- ----------------------------
DROP TABLE IF EXISTS `employee_inf`;
CREATE TABLE `employee_inf` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DEPT_ID` int(11) NOT NULL,
  `JOB_ID` int(11) NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `CARD_ID` varchar(18) NOT NULL,
  `ADDRESS` varchar(50) DEFAULT NULL,
  `POST_CODE` varchar(50) DEFAULT NULL,
  `TEL` varchar(16) DEFAULT NULL,
  `PHONE` varchar(11) DEFAULT NULL,
  `QQ_NUM` varchar(10) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `SEX` int(11) NOT NULL DEFAULT '1',
  `PARTY` varchar(10) DEFAULT NULL,
  `BIRTHDAY` datetime DEFAULT NULL,
  `RACE` varchar(100) DEFAULT NULL,
  `EDUCATION` varchar(10) DEFAULT NULL,
  `SPECIALITY` varchar(20) DEFAULT NULL,
  `HOBBY` varchar(100) DEFAULT NULL,
  `REMARK` varchar(500) DEFAULT NULL,
  `CREATE_DATE` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID`),
  KEY `FK_EMP_DEPT` (`DEPT_ID`),
  KEY `FK_EMP_JOB` (`JOB_ID`),
  CONSTRAINT `FK_EMP_DEPT` FOREIGN KEY (`DEPT_ID`) REFERENCES `dept_inf` (`ID`),
  CONSTRAINT `FK_EMP_JOB` FOREIGN KEY (`JOB_ID`) REFERENCES `job_inf` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee_inf
-- ----------------------------
INSERT INTO `employee_inf` VALUES ('2', '2', '4', '测试', '123454', '', '123456', '13630444146', null, '', '', '1', '群众', '2019-06-04 00:00:00', '', '小学', '', '', '', '2019-06-23 21:16:42');
INSERT INTO `employee_inf` VALUES ('3', '1', '3', '任昌耀', '123456', '', '123456', '13630444146', null, '', '', '0', '党员', '2019-06-04 00:00:00', '', '博士', '', '', '', '2019-07-06 09:23:47');
INSERT INTO `employee_inf` VALUES ('5', '8', '8', '舅舅、', '122333', '哦阿斯蒂芬静安寺哦大家发', '123222', '13189409616', null, '123123', '935932441@qq.com', '1', '群众', '2019-07-10 00:00:00', '汉', '高中', '你好', '没', '啊', '2019-07-06 09:36:41');

-- ----------------------------
-- Table structure for job_inf
-- ----------------------------
DROP TABLE IF EXISTS `job_inf`;
CREATE TABLE `job_inf` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(30) NOT NULL,
  `remark` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of job_inf
-- ----------------------------
INSERT INTO `job_inf` VALUES ('2', '会计师', '无');
INSERT INTO `job_inf` VALUES ('3', '普通职员', '无');
INSERT INTO `job_inf` VALUES ('4', '程序员', '无');
INSERT INTO `job_inf` VALUES ('5', 'wfed ', 'wfed ');
INSERT INTO `job_inf` VALUES ('7', '修改测试', '哈哈');
INSERT INTO `job_inf` VALUES ('8', '洗碗', '2');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `title` varchar(255) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(500) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('啊', '1', '啊啊');
INSERT INTO `notice` VALUES (' 为台湾', '2', '微软');
INSERT INTO `notice` VALUES ('啊', '3', '委任为');
INSERT INTO `notice` VALUES ('啊啊啊啊', '4', '啊啊啊啊啊啊');

-- ----------------------------
-- Table structure for user_inf
-- ----------------------------
DROP TABLE IF EXISTS `user_inf`;
CREATE TABLE `user_inf` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `loginname` varchar(20) NOT NULL,
  `PASSWORD` varchar(16) NOT NULL,
  `STATUS` int(11) NOT NULL DEFAULT '1',
  `createdate` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `username` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_inf
-- ----------------------------
INSERT INTO `user_inf` VALUES ('18', '任昌耀', '123456', '2', '2019-07-06 09:33:06', '任昌耀');
INSERT INTO `user_inf` VALUES ('23', '士大夫发射点', '123456', '0', '2019-06-09 16:50:36', '关键是大哥');
INSERT INTO `user_inf` VALUES ('25', '士大夫发', '123456', '0', '2019-06-09 16:50:43', '关键是大');
INSERT INTO `user_inf` VALUES ('26', '士大夫发', '123456', '0', '2019-06-09 16:50:46', '关键是大');
INSERT INTO `user_inf` VALUES ('27', '士大夫发', '123456', '0', '2019-06-09 16:50:51', '关键是');
INSERT INTO `user_inf` VALUES ('28', '士大夫发', '123456', '0', '2019-06-09 16:50:52', '关键是');
INSERT INTO `user_inf` VALUES ('29', '士大deg ', '123456', '0', '2019-06-09 16:51:00', '关键');
INSERT INTO `user_inf` VALUES ('30', '士大deg ', '123456', '0', '2019-06-09 16:51:01', '关键');
INSERT INTO `user_inf` VALUES ('31', '士大deg ', '123456', '0', '2019-06-09 16:51:03', '关键');
INSERT INTO `user_inf` VALUES ('32', '士大deg ', '123456', '0', '2019-06-09 16:51:09', '关');
INSERT INTO `user_inf` VALUES ('33', '士大f', '123456', '0', '2019-06-09 16:51:16', '关');
INSERT INTO `user_inf` VALUES ('34', '士大f', '123456', '1', '2019-06-22 23:31:45', '关与');
INSERT INTO `user_inf` VALUES ('35', 'jhniujhnuij', '123456', '0', '2019-06-09 20:09:36', '你');
INSERT INTO `user_inf` VALUES ('36', '士大夫', '123456', '2', '2019-06-22 23:31:32', '士大夫');
INSERT INTO `user_inf` VALUES ('43', 'admin', '980317', '2', '2019-07-06 09:33:09', 'admin');
INSERT INTO `user_inf` VALUES ('44', 'haha', '123456', '0', '2019-07-06 09:31:29', 'heihei');
