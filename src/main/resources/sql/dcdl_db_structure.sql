
use dcdl;

DROP TABLE if exists T_PLAYER CASCADE;
CREATE TABLE T_PLAYER (
 id_player INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_user_fk INT,
 league_rank INT,
 league_score INT
);

DROP TABLE if exists T_USER CASCADE;
CREATE TABLE T_USER (
 id_user INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 is_enabled BOOLEAN,
 creation_datetime DATETIME,
 pseudo VARCHAR(30),
 firstname VARCHAR(30),
 lastname VARCHAR(30),
 email VARCHAR(50) UNIQUE,
 password VARCHAR(50),
 birthdate DATETIME,
 country VARCHAR(40), 
 city VARCHAR(40)
);

CREATE TABLE IF NOT EXISTS T_ROLES (
 id_role INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_user_fk INT,
 role VARCHAR(45) NOT NULL
);

ALTER TABLE `dcdl`.`t_player` 
ADD INDEX `id_user_fk_idx` (`id_user_fk` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_player` 
ADD CONSTRAINT `id_user_fk_player`
  FOREIGN KEY (`id_user_fk`)
  REFERENCES `dcdl`.`t_user` (`id_user`);


ALTER TABLE `dcdl`.`t_roles` 
ADD INDEX `id_user_fk_idx` (`id_user_fk` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_roles` 
ADD CONSTRAINT `id_user_fk_roles`
  FOREIGN KEY (`id_user_fk`)
  REFERENCES `dcdl`.`t_user` (`id_user`);


INSERT INTO T_USER (`is_enable`, `creation_datetime`, `pseudo`,`firstname`,`lastname`,`email`,`password`,`birthdate`,`country`,`city`) VALUES (true, sysdate(), 'magikvince','Vincent', 'NAVARRO','vincent1603@hotmail.com', 'admin', '1978-03-16', 'FRANCE', 'MELUN');
INSERT INTO T_USER (`is_enable`, `creation_datetime`, `pseudo`,`firstname`,`lastname`,`email`,`password`,`birthdate`,`country`,`city`) VALUES (true, sysdate(), 'sayurisan','LESLIE', 'SAYURI','sayuri@hotmail.com', 'admin', '1974-05-30', 'FRANCE', 'MELUN');

INSERT INTO `dcdl`.`t_player` (`id_user_fk`,`league_rank`,`league_score`) VALUES(1,0,0);
INSERT INTO `dcdl`.`t_player` (`id_user_fk`,`league_rank`,`league_score`) VALUES(2,0,0);
