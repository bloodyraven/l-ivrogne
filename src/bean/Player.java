package bean;

public class Player {

	private String name;
	private int gorgees;
	
	/**
	 * New default player
	 * @param name
	 */
	public Player(String name) {
		this.setName(name);
		this.setGorgees(0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGorgees() {
		return gorgees;
	}

	public void setGorgees(int gorgees) {
		this.gorgees = gorgees;
	}
	
	
}
