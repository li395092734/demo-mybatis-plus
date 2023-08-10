
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDBDEFAULT CHARSET=utf8mb4;


INSERT INTO `user` (`id`, `name`) VALUES (1, '小明');
INSERT INTO `user` (`id`, `name`) VALUES (2, '小红');

