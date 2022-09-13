use dcdl;

DROP TABLE if exists T_USER_ROLE CASCADE;
DROP TABLE if exists T_PLAYER CASCADE;
DROP TABLE if exists T_ROLE CASCADE;
DROP TABLE if exists T_CONNECTION CASCADE;
DROP TABLE if exists T_USER CASCADE;
DROP TABLE if exists T_ROOM CASCADE;

DROP TABLE if exists T_LEAGUE CASCADE;
DROP TABLE if exists T_SOLUTION CASCADE;
DROP TABLE if exists T_SOLUTION_DETAIL CASCADE;
DROP TABLE if exists T_DRAW CASCADE;
DROP TABLE if exists T_GAME_PLAYERS CASCADE;
DROP TABLE if exists T_GAME_DRAWS CASCADE;
DROP TABLE if exists T_GAME CASCADE;


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


CREATE TABLE IF NOT EXISTS T_CONNECTION (
 id_connection INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_user_fk INT NOT NULL,
 dtLogon DATETIME,
 dtLogout DATETIME
);

CREATE TABLE IF NOT EXISTS T_ROOM (
 id_room INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(50) NOT NULL,
 description VARCHAR(200) NOT NULL,
 max_players INT
);

CREATE TABLE IF NOT EXISTS T_LEAGUE (
 id_league INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 league VARCHAR(50) NOT NULL,
 description VARCHAR(200) NOT NULL,
 time_count INT,
 time_letter INT
);

CREATE TABLE IF NOT EXISTS T_GAME (
 id_game INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_league_fk INT NOT NULL,
 -- private or public
 privacy VARCHAR(30) NOT NULL,
 -- friendly or ranker 
 type VARCHAR(30) NOT NULL, 
 description VARCHAR(200) NOT NULL,
 status VARCHAR(30) NOT NULL,
 start_time DATETIME NOT NULL,
 end_time DATETIME NOT NULL,
 winner INT,
 loser INT
);

-- association table between players and games, to know which player participate to the game 
CREATE TABLE IF NOT EXISTS T_GAME_PLAYERS (
 id_game_player INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_game_fk INT NOT NULL,
 id_player_fk INT NOT NULL
);

-- association table between game and draws, to know what draws are in the game 
CREATE TABLE IF NOT EXISTS T_GAME_DRAWS (
 id_game_draw INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 id_game_fk INT NOT NULL,
 id_draw_fk INT NOT NULL
);

CREATE TABLE IF NOT EXISTS T_DRAW (
id_draw INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
draw VARCHAR(20) NOT NULL,
draw_type VARCHAR(10) NOT NULL,
date DATETIME,
count INT,
wished_consonents INT,
wished_vowels INT
);

CREATE TABLE IF NOT EXISTS T_SOLUTION (
id_solution INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_draw_fk INT NOT NULL,
id_player_fk INT NOT NULL,
result VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS T_SOLUTION_DETAIL(
id_solution_detail INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
id_solution_fk INT NOT NULL,
number1 INT NOT NULL,
number2 INT NOT NULL,
operation_as_text VARCHAR(20),
order_in_solution INT,
result INT 
);

