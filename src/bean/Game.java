package bean;

import java.util.ArrayList;

public class Game {

	private ArrayList<Player> listPlayers;
	
	public Game(ArrayList<Player> listPlayers) {
		this.setListPlayers(listPlayers);
	}

	public ArrayList<Player> getListPlayers() {
		return listPlayers;
	}

	public void setListPlayers(ArrayList<Player> listPlayers) {
		this.listPlayers = listPlayers;
	}
}
