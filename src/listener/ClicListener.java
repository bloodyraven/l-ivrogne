package listener;

import java.awt.event.MouseListener;

import javax.swing.JPanel;

import utils.Constante;

public class ClicListener implements MouseListener {
	
	private JPanel p;
	
	public ClicListener(JPanel p) {
		super();
		this.setP(p);
	}
	
	private int getCarteCoord(int x, int y) {
		if(x>103 && x<202 && y>80 && y<223) {
			return 1;
		}
		if(x>103 && x<202 && y>238 && y<381) {
			return 2;
		}
		if(x>103 && x<246 && y>396 && y<495) {
			return 3;
		} 
		if(x>261 && x<404 && y>396 && y<495) {
			return 4;
		}
		if(x>419 && x<553 && y>396 && y<495) {
			return 5;
		}
		if(x>577 && x<720 && y>396 && y<495) {
			return 6;
		}
		if(x>735 && x<978 && y>396 && y<495) {
			return 7;
		}
		if(x>779 && x<878 && y>510 && y<644) {
			return 8;
		}
		if(x>779 && x<878 && y>668 && y<802) {
			return 9;
		}
		return -1;
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		//this.p.getGraphics().setColor(Color.blue);
		//this.p.getGraphics().fillOval(arg0.getX(), arg0.getY(), 50, 50);
		switch(getCarteCoord(arg0.getX(), arg0.getY())) {
			case 1: System.out.println("Clic sur carte 1");
					this.p.getGraphics().drawImage(Constante.c1,103,80,null);
					break;
			case 2: System.out.println("Clic sur carte 2");
					this.p.getGraphics().drawImage(Constante.cr,103,238,null);
					break;
			case 3: System.out.println("Clic sur carte 3");
					break;
			case 4: System.out.println("Clic sur carte 4");
					break;
			case 5: System.out.println("Clic sur carte 5");
					break;
			case 6: System.out.println("Clic sur carte 6");
					break;
			case 7: System.out.println("Clic sur carte 7");
					break;
			case 8: System.out.println("Clic sur carte 8");
					break;
			case 9: System.out.println("Clic sur carte 9");
					break;
			case 10: System.out.println("Clic sur carte 10");
					break;
			case 11: System.out.println("Clic sur carte 11");
					break;
			case 12: System.out.println("Clic sur carte 12");
					break;
			case 13: System.out.println("Clic sur carte 13");
					break;
			default: break;
		}
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
