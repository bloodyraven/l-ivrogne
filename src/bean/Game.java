package bean;

import java.util.ArrayList;
import java.util.Collections;

import utils.Constante;

public class Game {

	private ArrayList<Player> listPlayers;
	private ArrayList<Carte> listCartes;
	protected Tour currentTour;
	
	public Game(ArrayList<Player> listPlayers) {
		this.setListPlayers(listPlayers);
		initAndShuffle();
		currentTour=new Tour(this, this.listPlayers.get(0), 0);
	}
	
	public void initAndShuffle() {
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
		Collections.shuffle(listCartes);
	}
	
	public void shuffleCards() {
		Collections.shuffle(listCartes);
	}
	
	public void resetDiscovered() {
		for (Carte carte : listCartes) {
			carte.setDiscovered(false);
		}
	}
	
	public boolean allDiscovered() {
		for (Carte carte : listCartes) {
			if(!carte.isDiscovered())
				return false;
		}
		return true;
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

	public Tour getCurrentTour() {
		return currentTour;
	}
	
	public void setCurrentTour(Tour t) {
		this.currentTour=t;
	}

}
