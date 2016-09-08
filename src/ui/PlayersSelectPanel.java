package ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bean.Game;
import bean.Player;

public class PlayersSelectPanel extends JPanel {

	private static final long 	serialVersionUID = 1L;
	private JFrame 				f;
	private JTextField 			jtf1 = new JTextField(), 
								jtf2 = new JTextField(), 
								jtf3 = new JTextField(), 
								jtf4 = new JTextField(), 
								jtf5 = new JTextField(), 
								jtf6 = new JTextField();
	private JLabel 				jlbl1 = new JLabel("Player 1 : "), 
								jlbl2 = new JLabel("Player 2 : "), 
								jlbl3 = new JLabel("Player 3 : "), 
								jlbl4 = new JLabel("Player 4 : "), 
								jlbl5 = new JLabel("Player 5 : "), 
								jlbl6 = new JLabel("Player 6 : ");
	private Game 				g;
	
	public PlayersSelectPanel(JFrame f) {
		this.setF(f);
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(3, 2));
		jtf1.setPreferredSize(new Dimension(100, 25));
		jtf2.setPreferredSize(new Dimension(100, 25));
		jtf3.setPreferredSize(new Dimension(100, 25));
		jtf4.setPreferredSize(new Dimension(100, 25));
		jtf5.setPreferredSize(new Dimension(100, 25));
		jtf6.setPreferredSize(new Dimension(100, 25));
		grid.add(new PlayerSelectArea(jtf1, jlbl1));
		grid.add(new PlayerSelectArea(jtf2, jlbl2));
		grid.add(new PlayerSelectArea(jtf3, jlbl3));
		grid.add(new PlayerSelectArea(jtf4, jlbl4));
		grid.add(new PlayerSelectArea(jtf5, jlbl5));
		grid.add(new PlayerSelectArea(jtf6, jlbl6));
		JButton jb = new JButton("Let's drink");
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//ADD ALL PLAYERS IN GAME OBJECT AND AFFECT CLASS
				ArrayList<Player> listPlayers = new ArrayList<Player>();
				String tab[] = {"Juif", "Juif", "Reine", "Reine", "Roi", "Roi"};
				ArrayList<String> listClasse = new ArrayList<String>(Arrays.asList(tab));
				Collections.shuffle(listClasse);
				int i=0;
				for (Component comp : grid.getComponents()) {
					try{
						PlayerSelectArea psa = (PlayerSelectArea) comp;
						if(!psa.getJtf().getText().equals("")) {
							listPlayers.add(new Player(psa.getJtf().getText(), listClasse.get(i++)));
						}
					} catch(Exception e) {System.out.println("Error while getting players");}
				}
				
				//IF LESS THAN 2 NAMES
				if(listPlayers.size() < 2) {
					JOptionPane.showMessageDialog(f, "Entrez au moins deux noms", "Error", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				//IF TWO PLAYERS HAVE THE SAME NAME ERROR
				
				
				//REDIRECT ON NEXT SCREEN
				f.setContentPane(new GamePanel(f, new Game(listPlayers)));
				f.revalidate();
			}
		});
		this.setLayout(new BorderLayout());
		this.add(grid, BorderLayout.CENTER);
		this.add(jb, BorderLayout.SOUTH);
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
