package fr.magikvince.dcdl.social.room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Integer> 	{

	public boolean existsByName(String name);
	public Room findByName(String name);
	
	
}
