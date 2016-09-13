package ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bean.Game;

public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JFrame f;
	private Game g;
	
	public GamePanel(JFrame f, Game g) {
		this.setF(f);
		this.setG(g);
		this.setLayout(new BorderLayout());
		this.add(new PlayerPanel(f, g), BorderLayout.WEST);
		this.add(new PlateauPanel(f, g), BorderLayout.CENTER);
		this.f.setSize(1050, 930);
		this.f.setLocationRelativeTo(null);
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
