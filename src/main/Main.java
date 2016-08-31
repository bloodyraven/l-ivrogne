package main;

import javax.swing.JFrame;

import ui.GamePanel;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("L'ivrogne");
		f.setContentPane(new GamePanel());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 500);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}
}
