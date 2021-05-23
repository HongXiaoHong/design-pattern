package peron.hong.create.builder;

public class ProjectManager {

	private HouseBuilder builder;

	public HouseBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(HouseBuilder builder) {
		this.builder = builder;
	}

	public ProjectManager(HouseBuilder builder) {
		super();
		this.builder = builder;
	}

	public ProjectManager() {
		super();
	}
	
	public House decorate() {
		builder.buildWall();
		builder.buildDoor();
		builder.buildLight();
		return builder.getHouse();
	}
}
