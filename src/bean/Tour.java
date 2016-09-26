package bean;

import javax.swing.JOptionPane;


public class Tour {
	
	private Game g;
	private Player p;
	private int montantDes;
	private int gorgeesAcquises;
	private int index;

	public Tour(Game g, Player p) {
		this.setG(g);
		this.setP(p);
		gorgeesAcquises=0;
		montantDes = (int) ((Math.random() * 12) + 1);
		JOptionPane.showMessageDialog(null, p.getName()+", les d�s affichent"+montantDes+".", "Lancement de d�s", JOptionPane.PLAIN_MESSAGE);
		
		//retourne carte
			//si carte == nombre => fini & distrib gorg�es
			//si carte != nombre => ajout de gorg�es
			// si carte == as => restat gorg�es � 0
		
		//
	}

	public Game getG() {
		return g;
	}

	public void setG(Game g) {
		this.g = g;
	}

	public Player getP() {
		return p;
	}

	public void setP(Player p) {
		this.p = p;
	}

	public int getMontantDes() {
		return montantDes;
	}

	public void setMontantDes(int montantDes) {
		this.montantDes = montantDes;
	}

	public int getGorgeesAcquises() {
		return gorgeesAcquises;
	}

	public void setGorgeesAcquises(int gorgeesAcquises) {
		this.gorgeesAcquises = gorgeesAcquises;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
