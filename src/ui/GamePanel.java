package ui;

import java.awt.Graphics;

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
	}
	
	 @Override
     public void paintComponent(Graphics g) {
         super.paintComponent(g);

         //horizontal haut
         g.drawRect(10, 10, 88, 56);
         g.drawRect(108, 10, 88, 56);
         
         //horizontal mid
         g.drawRect(10, 200, 88, 56);
         g.drawRect(108, 200, 88, 56);
         g.drawRect(206, 200, 88, 56);
         g.drawRect(304, 200, 88, 56);
         g.drawRect(406, 200, 88, 56);
         
         //horizontal bas
         g.drawRect(304, 400, 88, 56);
         g.drawRect(406, 400, 88, 56);
         
         //vertical gauche
         g.drawRect(10, 260, 56, 88);
         g.drawRect(10, 356, 56, 88);
         
         //vertical mid
         g.drawRect(222, 10, 56, 88);
         g.drawRect(222, 108, 56, 88);
         g.drawRect(222, 260, 56, 88);
         g.drawRect(222, 356, 56, 88);
         
         //vertical droite
         g.drawRect(422, 10, 56, 88);
         g.drawRect(422, 108, 56, 88);
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
