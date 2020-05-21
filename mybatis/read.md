### 创建数据库
```sql
CREATE DATABASE springbootmybatis;
```
### 建表
```sql
DROP TABLE IF EXISTS  `city`;
CREATE TABLE `city` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` int(10) unsigned  NOT NULL COMMENT '省份编号',
  `city_name` varchar(25) DEFAULT NULL COMMENT '城市名称',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
```
### 数据
```sql
-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, 1, '承德市', 'BYSocket 的家在承德市');
INSERT INTO `city` VALUES (2, 1, '平泉市', 'BYSocket 的家在平泉市');
INSERT INTO `city` VALUES (3, 2, '沈阳市', 'BYSocket 的家在沈阳市');
```