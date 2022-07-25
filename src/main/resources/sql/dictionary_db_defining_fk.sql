/* defining foreign keys */
use dcdl;

ALTER TABLE `dcdl`.`t_language` 
ADD CONSTRAINT `id_author_fk`
  FOREIGN KEY (`id_author_fk`)
  REFERENCES `dcdl`.`t_author` (`id_author`);

ALTER TABLE `dcdl`.`t_dictionary` 
ADD CONSTRAINT `code_language_fk`
  FOREIGN KEY (`code_language_fk`)
  REFERENCES `dcdl`.`t_language` (`code_language`),
ADD CONSTRAINT `id_author_fk_t_dictionary`
  FOREIGN KEY (`id_author_fk`)
  REFERENCES `dcdl`.`t_author` (`id_author`);
  
ALTER TABLE `dcdl`.`t_word` 
ADD CONSTRAINT `id_dictionary_fk`
  FOREIGN KEY (`id_dictionary_fk`)
  REFERENCES `dcdl`.`t_dictionary` (`id_dictionary`),
ADD CONSTRAINT `id_author_fk_t_word`
  FOREIGN KEY (`id_author_fk`)
  REFERENCES `dcdl`.`t_author` (`id_author`),
ADD CONSTRAINT `id_word_type_fk`
  FOREIGN KEY (`id_word_type_fk`)
  REFERENCES `dcdl`.`t_word_type` (`id_word_type`);

ALTER TABLE `dcdl`.`t_word_definition` 
ADD CONSTRAINT `id_word_fk`
  FOREIGN KEY (`id_word_fk`)
  REFERENCES `dcdl`.`t_word` (`id_word`),
ADD CONSTRAINT `id_author_fk_t_word_def`
  FOREIGN KEY (`id_author_fk`)
  REFERENCES `dcdl`.`t_author` (`id_author`);
  
  
  /* inserting default values */
  INSERT INTO `dcdl`.`t_language` (`code_language`, `language`) VALUES ('FR','Français');
  INSERT INTO `dcdl`.`t_dictionary`(`id_dictionary`,`name`,`code_language_fk`,`description`) VALUES (1,'FRENCH DICTIONARY','FR','french dictionnary');