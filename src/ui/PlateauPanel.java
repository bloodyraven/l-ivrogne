package ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import listener.ClicListener;
import utils.Constante;
import bean.Carte;
import bean.Game;

public class PlateauPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JFrame f;
	private Game game;
	
	public PlateauPanel(JFrame f, Game g) {
		this.setF(f);
		this.setGame(g);
		this.addMouseListener(new ClicListener(this, g));
	}
	
	 @Override
     public void paintComponent(Graphics g) {
         super.paintComponent(g);
         g.drawImage(Constante.bg,0,0,null);
         
         ArrayList<Carte> listCartes = game.getListCartes();
         
         //horizontal haut
         drawCarte(g, Constante.X6, Constante.Y1, listCartes.get(0), true);
         drawCarte(g, Constante.X8, Constante.Y1, listCartes.get(1), true);
         
         //horizontal mid
         drawCarte(g, Constante.X3, Constante.Y5, listCartes.get(2), true);
         drawCarte(g, Constante.X5, Constante.Y5, listCartes.get(3), true);
         drawCarte(g, Constante.X7, Constante.Y5, listCartes.get(4), true);
         
         //horizontal bas
         drawCarte(g, Constante.X2, Constante.Y8, listCartes.get(5), true);
         drawCarte(g, Constante.X4, Constante.Y8, listCartes.get(6), true);
         
         //vertical gauche
         drawCarte(g, Constante.X1, Constante.Y9, listCartes.get(7), false);
         drawCarte(g, Constante.X1, Constante.Y4, listCartes.get(8), false);
         
         //vertical mid
         drawCarte(g, Constante.X6, Constante.Y3, listCartes.get(9), false);
         drawCarte(g, Constante.X6, Constante.Y6, listCartes.get(10), false);
         
         //vertical droite
         drawCarte(g, Constante.X9, Constante.Y5, listCartes.get(11), false);
         drawCarte(g, Constante.X9, Constante.Y7, listCartes.get(12), false);
     }
	 
	 private void drawCarte(Graphics g, int x, int y, Carte c, boolean turned) {
		 if(c.isDiscovered()) {
			 if(turned) {
				 g.drawImage(c.getImageTurned(),x,y,null);
			 } else {
				 g.drawImage(c.getImage(),x,y,null);
			 }
         } else {
        	 if(turned) {
        		 g.drawImage(rotate90DX(Constante.c0),x,y,null);
        	 } else {
        		 g.drawImage(Constante.c0,x,y,null);
        	 }
         }
	 }
	 
	 private BufferedImage rotate90DX(BufferedImage bi) {
	    int width = bi.getWidth();
	    int height = bi.getHeight();
	    BufferedImage biFlip = new BufferedImage(height, width, bi.getType());
	    for(int i=0; i<width; i++)
	        for(int j=0; j<height; j++)
	            biFlip.setRGB(height-1-j, width-1-i, bi.getRGB(i, j));
	    return biFlip;
	}

	public JFrame getF() {
		return f;
	}

	public void setF(JFrame f) {
		this.f = f;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game g) {
		this.game = g;
	}
	 
}
