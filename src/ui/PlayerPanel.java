package ui;

import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import bean.Game;
import bean.Player;

public class PlayerPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JFrame f;
	private Game g;
	
	public PlayerPanel(JFrame f, Game g) {
		this.setF(f);
		this.setG(g);
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//AJOUTER LES PERSOS AU PANEL
		Iterator<Player> it = g.getListPlayers().iterator();
		while(it.hasNext()) {
			this.add(new PlayerStatsPanel(it.next()));
		}
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}

	public Game getG() {
		return g;
	}

	public void setG(Game g) {
		this.g = g;
	}
}
