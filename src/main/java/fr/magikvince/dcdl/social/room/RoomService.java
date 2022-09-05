package fr.magikvince.dcdl.social.room;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;

@Service
public class RoomService {

	private Collection<Room> rooms;
	
	public RoomService()
	{
		this.rooms = new ArrayList<Room>();
	}
	
	public Collection<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Collection<Room> rooms) {
		this.rooms = rooms;
	}

	public void addRoom(Room room)
	{
		rooms.add(room);
	}
	
	public void deleteRoom(Room room)
	{
		rooms.remove(room);
	}
	
}
