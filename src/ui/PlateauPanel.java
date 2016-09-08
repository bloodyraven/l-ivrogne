package ui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import listener.ClicListener;

public class PlateauPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JFrame f;
	
	public PlateauPanel(JFrame f) {
		this.setF(f);
		this.addMouseListener(new ClicListener(this));
	}
	
	 @Override
     public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.setColor(Color.DARK_GRAY);
         g.fillRect(0, 0, 700, 700);

         g.setColor(Color.WHITE);
         
         //horizontal haut
         g.fillRoundRect(18, 10, 90, 50, 10, 10);
         g.fillRoundRect(124, 10, 90, 50, 10, 10);
         
         //horizontal mid
         g.fillRoundRect(10, 210, 90, 50, 10, 10);
         g.fillRoundRect(110, 210, 90, 50, 10, 10);
         g.fillRoundRect(210, 210, 90, 50, 10, 10);
         g.fillRoundRect(310, 210, 90, 50, 10, 10);
         g.fillRoundRect(410, 210, 90, 50, 10, 10);
         
         //horizontal bas
         g.fillRoundRect(296, 410, 90, 50, 10, 10);
         g.fillRoundRect(402, 410, 90, 50, 10, 10);
         
         //vertical gauche
         g.fillRoundRect(10, 270, 50, 90, 10, 10);
         g.fillRoundRect(10, 370, 50, 90, 10, 10);
         
         //vertical mid
         g.fillRoundRect(230, 10, 50, 90, 10, 10);
         g.fillRoundRect(230, 110, 50, 90, 10, 10);
         g.fillRoundRect(230, 270, 50, 90, 10, 10);
         g.fillRoundRect(230, 370, 50, 90, 10, 10);
         
         //vertical droite
         g.fillRoundRect(450, 10, 50, 90, 10, 10);
         g.fillRoundRect(450, 108, 50, 90, 10, 10);
         
         g.setColor(Color.red);
         g.fillRect(23, 15, 80, 40);
         g.fillRect(129, 15, 80, 40);
     }

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}

}
