CREATE TABLE `payment`
(
    `id`     bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `serial` varchar(200) default '',
    primary key (`id`)
) ENGINE = innoDb
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;