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


INSERT INTO `dcdl`.`t_room`(`name`, `description`, `max_players`) VALUES ('main room 1', 'main room 1 to welcome players when they log on','100');
INSERT INTO `dcdl`.`t_room`(`name`, `description`, `max_players`) VALUES ('club 1', 'club room 1','100');
INSERT INTO `dcdl`.`t_room`(`name`, `description`, `max_players`) VALUES ('tournaments 1', 'tournaments room 1','100');

--
INSERT INTO `dcdl`.`t_league`(`league`,`description`,`time_count`,`time_letter`) VALUES ('bronze', 'league for beginner', 180, 180);
INSERT INTO `dcdl`.`t_league`(`league`,`description`,`time_count`,`time_letter`) VALUES ('silver', 'league for mid beginner', 150, 150);
INSERT INTO `dcdl`.`t_league`(`league`,`description`,`time_count`,`time_letter`) VALUES ('gold', 'league for medium players', 120, 120);
INSERT INTO `dcdl`.`t_league`(`league`,`description`,`time_count`,`time_letter`) VALUES ('platinium', 'league for good players', 90, 90);
INSERT INTO `dcdl`.`t_league`(`league`,`description`,`time_count`,`time_letter`) VALUES ('diamond', 'league for experts', 60, 60);
