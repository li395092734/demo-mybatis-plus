# demo-mybatis-plus

## 项目介绍
本项目是初始化Mybatis-plus的代码，其中内置了Mybatis-plus需要的Jar包。环境方面内置MySQL。
MySQL连接信息：
```
IP：127.0.0.1
账号：root
密码：root
数据库：root
```

## 使用
启动Springboot项目：

在浏览器中输入以下地址(前缀随服务不同，地址不同)：
https://oewgaz-yuhsqq-80.preview.myide.io/user/get

就可以查看到的数据
```
[{"id":1,"name":"小明"},{"id":2,"name":"小红"}]
```
![本地查看](图片001.png)

## 查看MySQL数据
建表SQL，在create.sql文件中
```sql
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDBDEFAULT CHARSET=utf8mb4;

INSERT INTO `user` (`id`, `name`) VALUES (1, '小明');
INSERT INTO `user` (`id`, `name`) VALUES (2, '小红');
```
![MySQL数据](图片002.png)