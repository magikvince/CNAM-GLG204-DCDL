use dcdl;

DROP TABLE if exists T_USER_ROLE CASCADE;
DROP TABLE if exists T_PLAYER CASCADE;
DROP TABLE if exists T_ROLE CASCADE;
DROP TABLE if exists T_USER CASCADE;

CREATE TABLE T_PLAYER (
 id_player INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_user_fk INT,
 league_rank INT,
 league_score INT
);

-- in second position due to drop cascade with T_PLAYER
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

-- describing all roles existing in the application
CREATE TABLE IF NOT EXISTS T_ROLE (
 id_role INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 role VARCHAR(45) NOT NULL
);

-- association table between users and roles ==> what roles do a user have?
CREATE TABLE IF NOT EXISTS T_USER_ROLE (
 id_user_role INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_user_fk INT NOT NULL,
 id_role_fk INT NOT NULL
);
