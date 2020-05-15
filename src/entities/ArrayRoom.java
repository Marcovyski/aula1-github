package entities;

public class ArrayRoom {
	
	private String name;
	private String email;
	private String room;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}

	public ArrayRoom(String name, String email, String room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}





}
