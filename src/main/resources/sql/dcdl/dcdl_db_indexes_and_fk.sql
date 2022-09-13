use dcdl;

ALTER TABLE `dcdl`.`t_player` 
ADD INDEX `id_player_idx` (`id_player` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_player` 
ADD CONSTRAINT `id_user_fk_player`
  FOREIGN KEY (`id_user_fk`)
  REFERENCES `dcdl`.`t_user` (`id_user`);

-- describing all roles existing in the application
ALTER TABLE `dcdl`.`t_role` 
ADD INDEX `id_role_idx` (`id_role` ASC) VISIBLE;

-- association table between users and roles ==> what roles do a user have?
ALTER TABLE `dcdl`.`t_user_role` 
ADD INDEX `id_user_role_idx` (`id_user_role` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_user_role` 
ADD CONSTRAINT `id_user_fk_role`
  FOREIGN KEY (`id_user_fk`)
  REFERENCES `dcdl`.`t_user` (`id_user`),
ADD CONSTRAINT `id_role_fk`
  FOREIGN KEY (`id_role_fk`)
  REFERENCES `dcdl`.`t_role` (`id_role`);

ALTER TABLE `dcdl`.`t_connection` 
ADD INDEX `id_connection_idx` (`id_connection` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_connection` 
ADD CONSTRAINT `id_user_fk_connection`
  FOREIGN KEY (`id_user_fk`)
  REFERENCES `dcdl`.`t_user` (`id_user`)
;

ALTER TABLE `dcdl`.`t_room` 
ADD INDEX `id_room_idx` (`id_room` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_league` 
ADD INDEX `id_league_idx` (`id_league` ASC) VISIBLE;


ALTER TABLE `dcdl`.`t_game` 
ADD INDEX `id_game_idx` (`id_game` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_game` 
ADD CONSTRAINT `id_league_fk_game`
  FOREIGN KEY (`id_league_fk`)
  REFERENCES `dcdl`.`t_league` (`id_league`),
ADD CONSTRAINT `id_creator_fk`
  FOREIGN KEY (`creator`)
  REFERENCES `dcdl`.`t_player` (`id_player`),
ADD CONSTRAINT `id_winner_fk`
  FOREIGN KEY (`winner`)
  REFERENCES `dcdl`.`t_player` (`id_player`),  
ADD CONSTRAINT `id_loser_fk`
  FOREIGN KEY (`loser`)
  REFERENCES `dcdl`.`t_player` (`id_player`);


ALTER TABLE `dcdl`.`t_draw` 
ADD INDEX `id_draw_idx` (`id_draw` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_solution` 
ADD INDEX `id_solution_idx` (`id_solution` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_solution` 
ADD CONSTRAINT `id_player_fk_solution`
  FOREIGN KEY (`id_player_fk`)
  REFERENCES `dcdl`.`t_player` (`id_player`),
ADD CONSTRAINT `id_draw_fk_solution`
  FOREIGN KEY (`id_draw_fk`)
  REFERENCES `dcdl`.`t_draw` (`id_draw`);

ALTER TABLE `dcdl`.`t_solution_detail` 
ADD INDEX `id_solution_detail_idx` (`id_solution_detail` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_solution_detail` 
ADD CONSTRAINT `id_solution_fk_detail`
  FOREIGN KEY (`id_solution_fk`)
  REFERENCES `dcdl`.`t_solution` (`id_solution`);

-- association table between games and draws ==> what draws does a game contain?
ALTER TABLE `dcdl`.`t_game_draws` 
ADD INDEX `id_game_draw_idx` (`id_game_draw` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_game_draws` 
ADD CONSTRAINT `id_game_fk_draws`
  FOREIGN KEY (`id_game_fk`)
  REFERENCES `dcdl`.`t_game` (`id_game`),
ADD CONSTRAINT `id_draw_fk`
  FOREIGN KEY (`id_draw_fk`)
  REFERENCES `dcdl`.`t_draw` (`id_draw`);


-- association table between games and players ==> what players are playing in the game?
ALTER TABLE `dcdl`.`t_game_players` 
ADD INDEX `id_game_player_idx` (`id_game_player` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_game_players` 
ADD CONSTRAINT `id_game_fk_players`
  FOREIGN KEY (`id_game_fk`)
  REFERENCES `dcdl`.`t_game` (`id_game`),
ADD CONSTRAINT `id_player_fk`
  FOREIGN KEY (`id_player_fk`)
  REFERENCES `dcdl`.`t_player` (`id_player`);
