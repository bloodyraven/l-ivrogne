package main;

import javax.swing.JFrame;

import ui.PlayersSelectPanel;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("L'ivrogne");
		f.setContentPane(new PlayersSelectPanel(f));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(570, 510);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
