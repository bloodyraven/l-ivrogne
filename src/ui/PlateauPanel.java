package ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bean.Carte;
import bean.Game;
import listener.ClicListener;
import utils.Constante;

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
         if(listCartes.get(0).isDiscovered()) {
        	 g.drawImage(listCartes.get(0).getImageTurned(),Constante.X6,Constante.Y1,null);
         } else {
        	 g.drawImage(rotate90DX(Constante.c0),Constante.X6,Constante.Y1,null);
         }
         g.drawImage(rotate90DX(Constante.c0),Constante.X8,Constante.Y1,null);
         
         //horizontal mid
         g.drawImage(rotate90DX(Constante.c0),Constante.X3,Constante.Y5,null);
         g.drawImage(rotate90DX(Constante.c0),Constante.X5,Constante.Y5,null);
         g.drawImage(rotate90DX(Constante.c0),Constante.X7,Constante.Y5,null);
         
         //horizontal bas
         g.drawImage(rotate90DX(Constante.c0),Constante.X2,Constante.Y8,null);
         g.drawImage(rotate90DX(Constante.c0),Constante.X4,Constante.Y8,null);
         
         //vertical gauche
         g.drawImage(Constante.c0,Constante.X1,Constante.Y9,null);
         g.drawImage(Constante.c0,Constante.X1,Constante.Y4,null);
         
         //vertical mid
         g.drawImage(Constante.c0,Constante.X6,Constante.Y3,null);
         g.drawImage(Constante.c0,Constante.X6,Constante.Y6,null);
         
         //vertical droite
         g.drawImage(Constante.c0,Constante.X9,Constante.Y5,null);
         g.drawImage(Constante.c0,Constante.X9,Constante.Y7,null);
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
