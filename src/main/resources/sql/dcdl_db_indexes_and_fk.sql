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
