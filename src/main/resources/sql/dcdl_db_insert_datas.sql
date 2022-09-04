use dcdl;

INSERT INTO T_USER (`is_enabled`, `creation_datetime`, `pseudo`,`firstname`,`lastname`,`email`,`password`,`birthdate`,`country`,`city`) VALUES (true, sysdate(), 'magikvince','Vincent', 'NAVARRO','vincent1603@hotmail.com', 'admin', '1978-03-16', 'FRANCE', 'MELUN');
INSERT INTO T_USER (`is_enabled`, `creation_datetime`, `pseudo`,`firstname`,`lastname`,`email`,`password`,`birthdate`,`country`,`city`) VALUES (true, sysdate(), 'sayurisan','LESLIE', 'SAYURI','sayuri@hotmail.com', 'admin', '1974-05-30', 'FRANCE', 'MELUN');


INSERT INTO `dcdl`.`t_role` (`role`) VALUES ('ADMIN');
INSERT INTO `dcdl`.`t_role` (`role`) VALUES ('DICO_ADMIN');
INSERT INTO `dcdl`.`t_role` (`role`) VALUES ('PLAYER');
INSERT INTO `dcdl`.`t_role` (`role`) VALUES ('VISITOR');
INSERT INTO `dcdl`.`t_role` (`role`) VALUES ('CLUB_PRESIDENT');
INSERT INTO `dcdl`.`t_role` (`role`) VALUES ('CLUB_OFFICER');
INSERT INTO `dcdl`.`t_role` (`role`) VALUES ('CLUB_MEMBER');


INSERT INTO `dcdl`.`t_player` (`id_user_fk`,`league_rank`,`league_score`) VALUES(1,0,0);
INSERT INTO `dcdl`.`t_player` (`id_user_fk`,`league_rank`,`league_score`) VALUES(2,0,0);

INSERT INTO `dcdl`.`t_user_role` (`id_user_fk`,`id_role_fk`) VALUES (1,1);
INSERT INTO `dcdl`.`t_user_role` (`id_user_fk`,`id_role_fk`) VALUES (1,2);
INSERT INTO `dcdl`.`t_user_role` (`id_user_fk`,`id_role_fk`) VALUES (2,2);

INSERT INTO `dcdl`.`t_user_role` (`id_user_fk`,`id_role_fk`) VALUES (1,3);
INSERT INTO `dcdl`.`t_user_role` (`id_user_fk`,`id_role_fk`) VALUES (2,3);