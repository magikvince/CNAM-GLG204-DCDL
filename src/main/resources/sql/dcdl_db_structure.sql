
use dcdl;

DROP TABLE if exists T_PLAYER CASCADE;
CREATE TABLE T_PLAYER (
 id_player INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_user_fk INT,
 pseudo VARCHAR(30) NOT NULL,
 league_rank INT,
 league_score INT
);

DROP TABLE if exists T_USER CASCADE;
CREATE TABLE T_USER (
 id_user INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 pseudo VARCHAR(30),
 firstname VARCHAR(30),
 lastname VARCHAR(30),
 email VARCHAR(50) UNIQUE,
 password VARCHAR(50),
 birthdate DATETIME,
 country VARCHAR(40), 
 city VARCHAR(40)
);

INSERT INTO T_USER (`pseudo`,`firstname`,`lastname`,`email`,`password`,`birthdate`,`country`,`city`) VALUES ('magikvince','Vincent', 'NAVARRO','vincent1603@hotmail.com', 'admin', '1978-03-16', 'FRANCE', 'MELUN');
INSERT INTO T_USER (`pseudo`,`firstname`,`lastname`,`email`,`password`,`birthdate`,`country`,`city`) VALUES ('sayurisan','LESLIE', 'SAYURI','sayuri@hotmail.com', 'admin', '1974-05-30', 'FRANCE', 'MELUN');

ALTER TABLE `dcdl`.`t_player` 
ADD INDEX `id_user_fk_idx` (`id_user_fk` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_player` 
ADD CONSTRAINT `id_user_fk`
  FOREIGN KEY (`id_user_fk`)
  REFERENCES `dcdl`.`t_user` (`id_user`);

INSERT INTO `dcdl`.`t_player` (`id_user_fk`,`pseudo`,`league_rank`,`league_score`) VALUES(1,'magikvince',0,0);
INSERT INTO `dcdl`.`t_player` (`id_user_fk`,`pseudo`,`league_rank`,`league_score`) VALUES(2,'sayurisan',0,0);

