package listener;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class ClicListener implements MouseListener {
	
	private JPanel p;
	
	public ClicListener(JPanel p) {
		super();
		this.setP(p);
	}
	
	private Dimension getCarteCoord(int x, int y) {
		return null;
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		this.p.getGraphics().setColor(Color.blue);
		this.p.getGraphics().fillOval(arg0.getX(), arg0.getY(), 50, 50);
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public JPanel getP() {
		return p;
	}

	public void setP(JPanel p) {
		this.p = p;
	}

}
