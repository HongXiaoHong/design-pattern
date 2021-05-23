package peron.hong.create.builder;

public class House {

	private String wall;
	private String door;
	private String light;
	public String getWall() {
		return wall;
	}
	public void setWall(String wall) {
		this.wall = wall;
	}
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public String getLight() {
		return light;
	}
	public void setLight(String light) {
		this.light = light;
	}
	@Override
	public String toString() {
		return "House [wall=" + wall + ", door=" + door + ", light=" + light + "]";
	}
	
}
