package bean;

public class Player {

	private String name;
	private int gorgees;
	private String classe;
	private int numCarte;
	
	/**
	 * New default player
	 * @param name
	 */
	public Player(String name) {
		this.setName(name);
		this.setGorgees(0);
	}
	
	public Player(String name, String classe) {
		this(name);
		this.setClasse(classe);
		if(classe.equals("juif")) {
			numCarte=11;
		} else if(classe.equals("roi")) {
			numCarte=13;
		} else {
			numCarte=12;
		}
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

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public int getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}
	
	
}
