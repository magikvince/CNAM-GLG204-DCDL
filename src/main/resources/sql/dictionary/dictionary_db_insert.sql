/* inserting default values */

/* inserting authors */
INSERT INTO `dcdl`.`t_author` (`pseudo`,`firstname`,`lastname`) VALUES ( 'MAGIKVINCE', 'Vincent', 'NAVARRO');
INSERT INTO `dcdl`.`t_author` (`pseudo`,`firstname`,`lastname`) VALUES ( 'JMDOUIN', 'Jean-Michel', 'DOUIN');
INSERT INTO `dcdl`.`t_author` (`pseudo`,`firstname`,`lastname`) VALUES ( 'SROSMORDUC', 'Serge', 'ROSMORDUC');
INSERT INTO `dcdl`.`t_author` (`pseudo`,`firstname`,`lastname`) VALUES ( 'PGRAFFION', 'Pascal', 'GRAFFION');

/* inserting languages */  
INSERT INTO `dcdl`.`t_language` (`code_language`, `language`, `id_author_fk`) VALUES ('FR','Français', 1);
INSERT INTO `dcdl`.`t_language`(`code_language`,`language`,`id_author_fk`) VALUES ('ES','Espagnol',2);
INSERT INTO `dcdl`.`t_language`(`code_language`,`language`,`id_author_fk`) VALUES ('UK','Anglais', 3);

/* inserting dictionaries */
INSERT INTO `dcdl`.`t_dictionary` (`name`,`id_language_fk`,`id_author_fk`,`description`)  VALUES ('dico_fr', 1, 1,'dictionnaire Français');
INSERT INTO `dcdl`.`t_dictionary` (`name`,`id_language_fk`,`id_author_fk`,`description`)  VALUES ('dico_es', 2, 2,'dictionnaire Espagnol');
INSERT INTO `dcdl`.`t_dictionary` (`name`,`id_language_fk`,`id_author_fk`,`description`)  VALUES ('dico_uk', 3, 3,'dictionnaire Anglais');


/* inserting word types for french language */  
INSERT INTO `dcdl`.`t_word_type` (`id_author_fk`,`id_language_fk`,`word_type`) VALUES (1, 1, 'nom');
INSERT INTO `dcdl`.`t_word_type` (`id_author_fk`,`id_language_fk`,`word_type`) VALUES (1, 1, 'verbe');
INSERT INTO `dcdl`.`t_word_type` (`id_author_fk`,`id_language_fk`,`word_type`) VALUES (1, 1, 'adjectif');
INSERT INTO `dcdl`.`t_word_type` (`id_author_fk`,`id_language_fk`,`word_type`) VALUES (1, 1, 'adverbe');
INSERT INTO `dcdl`.`t_word_type` (`id_author_fk`,`id_language_fk`,`word_type`) VALUES (1, 1, 'déterminant');
INSERT INTO `dcdl`.`t_word_type` (`id_author_fk`,`id_language_fk`,`word_type`) VALUES (1, 1, 'préposition');
INSERT INTO `dcdl`.`t_word_type` (`id_author_fk`,`id_language_fk`,`word_type`) VALUES (1, 1, 'conjonction');
INSERT INTO `dcdl`.`t_word_type` (`id_author_fk`,`id_language_fk`,`word_type`) VALUES (1, 1, 'interjection');