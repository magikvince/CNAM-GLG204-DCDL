
use dcdl;

DROP TABLE if exists T_PLAYER CASCADE;
CREATE TABLE T_PLAYER (
 id_player INT(8) NOT NULL PRIMARY KEY AUTO_INCREMENT,
 pseudo VARCHAR(30),
 firstname VARCHAR(30),
 lastname VARCHAR(30),
 email VARCHAR(50) UNIQUE,
 password VARCHAR(50),
 birthdate DATETIME,
 country VARCHAR(40), 
 city VARCHAR(40)
);

INSERT INTO `dcdl`.`t_player` (`pseudo`,`firstname`,`lastname`,`email`,`password`,`birthdate`,`country`,`city`) VALUES ('magikvince','Vincent', 'NAVARRO','vincent1603@hotmail.com', 'admin', '1978-03-16', 'FRANCE', 'MELUN');
INSERT INTO `dcdl`.`t_player` (`pseudo`,`firstname`,`lastname`,`email`,`password`,`birthdate`,`country`,`city`) VALUES ('sayurisan','LESLIE', 'SAYURI','sayuri@hotmail.com', 'admin', '1974-05-30', 'FRANCE', 'MELUN');