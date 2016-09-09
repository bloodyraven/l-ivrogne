package bean;

import java.util.ArrayList;

import utils.Constante;

public class Game {

	private ArrayList<Player> listPlayers;
	private ArrayList<Carte> listCartes;
	
	public Game(ArrayList<Player> listPlayers) {
		this.setListPlayers(listPlayers);
		listCartes = new ArrayList<Carte>();
		listCartes.add(new Carte(1, Constante.c1));
		listCartes.add(new Carte(2, Constante.c2));
		listCartes.add(new Carte(3, Constante.c3));
		listCartes.add(new Carte(4, Constante.c4));
		listCartes.add(new Carte(5, Constante.c5));
		listCartes.add(new Carte(6, Constante.c6));
		listCartes.add(new Carte(7, Constante.c7));
		listCartes.add(new Carte(8, Constante.c8));
		listCartes.add(new Carte(9, Constante.c9));
		listCartes.add(new Carte(10, Constante.c10));
		listCartes.add(new Carte(11, Constante.cv));
		listCartes.add(new Carte(12, Constante.cd));
		listCartes.add(new Carte(13, Constante.cr));
	}

	public ArrayList<Player> getListPlayers() {
		return listPlayers;
	}

	public void setListPlayers(ArrayList<Player> listPlayers) {
		this.listPlayers = listPlayers;
	}

	public ArrayList<Carte> getListCartes() {
		return listCartes;
	}

	public void setListCartes(ArrayList<Carte> listCartes) {
		this.listCartes = listCartes;
	}
}
