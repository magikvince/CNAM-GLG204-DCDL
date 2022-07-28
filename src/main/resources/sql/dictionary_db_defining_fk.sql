/* defining foreign keys */
use dcdl;

ALTER TABLE `dcdl`.`t_language` 
ADD CONSTRAINT `id_author_fk`
  FOREIGN KEY (`id_author_fk`)
  REFERENCES `dcdl`.`t_author` (`id_author`);

ALTER TABLE `dcdl`.`t_dictionary` 
ADD CONSTRAINT `id_language_fk`
  FOREIGN KEY (`id_language_fk`)
  REFERENCES `dcdl`.`t_language` (`id_language`),
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

ALTER TABLE `dcdl`.`t_word_type` 
ADD CONSTRAINT `id_author_fk_t_word_type`
  FOREIGN KEY (`id_author_fk`)
  REFERENCES `dcdl`.`t_author` (`id_author`),
ADD CONSTRAINT `id_language_fk_t_word_type`
  FOREIGN KEY (`id_language_fk`)
  REFERENCES `dcdl`.`t_language` (`id_language`);

ALTER TABLE `dcdl`.`t_word_definition` 
ADD CONSTRAINT `id_word_fk`
  FOREIGN KEY (`id_word_fk`)
  REFERENCES `dcdl`.`t_word` (`id_word`),
ADD CONSTRAINT `id_author_fk_t_word_def`
  FOREIGN KEY (`id_author_fk`)
  REFERENCES `dcdl`.`t_author` (`id_author`);
 