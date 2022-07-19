package fr.magikvince.dcdl.dictionary.author;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> 	{

	public boolean existsByPseudo(String email);
	public Author findByPseudo(String email);
}
