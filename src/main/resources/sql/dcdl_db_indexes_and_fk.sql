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

-- association table between USERS and ROLES ==> which roles has a user
ALTER TABLE `dcdl`.`t_users_roles` 
ADD INDEX `id_users_roles_idx` (`id_users_roles` ASC) VISIBLE;

ALTER TABLE `dcdl`.`t_users_roles` 
ADD CONSTRAINT `id_user_fk_roles`
  FOREIGN KEY (`id_user_fk`)
  REFERENCES `dcdl`.`t_user` (`id_user`)
ADD CONSTRAINT `id_role_fk`
  FOREIGN KEY (`id_role_fk`)
  REFERENCES `dcdl`.`t_roles` (`id_role`);
