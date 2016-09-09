package ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import listener.ClicListener;
import utils.Constante;

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
         g.drawImage(Constante.bg,0,0,null);
         
         // 667 hor

         //horizontal haut
         g.drawImage(rotate90DX(Constante.c0),577,80,null);
         g.drawImage(rotate90DX(Constante.c0),746,80,null);
         
         //horizontal mid
         g.drawImage(rotate90DX(Constante.c0),103,396,null);
         g.drawImage(rotate90DX(Constante.c0),261,396,null);
         g.drawImage(rotate90DX(Constante.c0),419,396,null);
         g.drawImage(rotate90DX(Constante.c0),577,396,null);
         g.drawImage(rotate90DX(Constante.c0),735,396,null);
         
         //horizontal bas
         g.drawImage(rotate90DX(Constante.c0),103,712,null);
         g.drawImage(rotate90DX(Constante.c0),272,712,null);
         
         //vertical gauche
         g.drawImage(Constante.c0,103,80,null);
         g.drawImage(Constante.c0,103,238,null);
         
         //vertical mid
         g.drawImage(Constante.c0,441,80,null);
         g.drawImage(Constante.c0,441,238,null);
         g.drawImage(Constante.c0,441,510,null);
         g.drawImage(Constante.c0,441,668,null);
         
         //vertical droite
         g.drawImage(Constante.c0,779,510,null);
         g.drawImage(Constante.c0,779,668,null);
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
	 
}
