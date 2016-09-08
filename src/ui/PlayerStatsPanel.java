package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import bean.Player;

public class PlayerStatsPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public PlayerStatsPanel(Player p) {
		JLabel jl1 = new JLabel(p.getName());
		JLabel jl2 = new JLabel(p.getClasse());
		this.add(jl1);
		this.add(jl2);
	}

}
