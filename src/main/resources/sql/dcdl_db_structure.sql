
use dcdl;

DROP TABLE if exists T_PLAYER CASCADE;
CREATE TABLE T_PLAYER (
 id_player NUMERIC(8) NOT NULL PRIMARY KEY,
 pseudo VARCHAR(30),
 firstname VARCHAR(30),
 lastname VARCHAR(30),
 email VARCHAR(50),
 password VARCHAR(50),
 birthdate DATETIME,
 country VARCHAR(40), 
 city VARCHAR(40)
);