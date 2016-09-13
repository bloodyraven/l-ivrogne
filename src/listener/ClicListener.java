package listener;

import java.awt.event.MouseListener;

import javax.swing.JPanel;

import utils.Constante;
import utils.Utils;

public class ClicListener implements MouseListener {
	
	private JPanel p;
	
	public ClicListener(JPanel p) {
		super();
		this.setP(p);
	}
	
	private int getCarteCoord(int x, int y) {
		if(x>Constante.X6 && x<Constante.X6+143 && y>Constante.Y1 && y<Constante.Y1+99) {
			return 1;
		}
		if(x>Constante.X8 && x<Constante.X8+143 && y>Constante.Y1 && y<Constante.Y1+99) {
			return 2;
		}
		if(x>Constante.X3 && x<Constante.X3+143 && y>Constante.Y5 && y<Constante.Y5+99) {
			return 3;
		} 
		if(x>Constante.X5 && x<Constante.X5+143 && y>Constante.Y5 && y<Constante.Y5+99) {
			return 4;
		}
		if(x>Constante.X7 && x<Constante.X7+143 && y>Constante.Y5 && y<Constante.Y5+99) {
			return 5;
		}
		if(x>Constante.X2 && x<Constante.X2+143 && y>Constante.Y8 && y<Constante.Y8+99) {
			return 6;
		}
		if(x>Constante.X4 && x<Constante.X4+143 && y>Constante.Y8 && y<Constante.Y8+99) {
			return 7;
		}
		if(x>Constante.X1 && x<Constante.X1+99 && y>Constante.Y9 && y<Constante.Y9+143) {
			return 8;
		}
		if(x>Constante.X1 && x<Constante.X1+99 && y>Constante.Y4 && y<Constante.Y4+143) {
			return 9;
		}
		if(x>Constante.X6 && x<Constante.X6+99 && y>Constante.Y3 && y<Constante.Y3+143) {
			return 10;
		}
		if(x>Constante.X6 && x<Constante.X6+99 && y>Constante.Y6 && y<Constante.Y6+143) {
			return 11;
		}
		if(x>Constante.X9 && x<Constante.X9+99 && y>Constante.Y5 && y<Constante.Y5+143) {
			return 12;
		}
		if(x>Constante.X9 && x<Constante.X9+99 && y>Constante.Y7 && y<Constante.Y7+143) {
			return 13;
		}
		return -1;
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		switch(getCarteCoord(arg0.getX(), arg0.getY())) {
			case 1: System.out.println("Clic sur carte 1");
					this.p.getGraphics().drawImage(Utils.rotate90DX(Constante.c1),Constante.X6,Constante.Y1,null);
					break;
			case 2: System.out.println("Clic sur carte 2");
					this.p.getGraphics().drawImage(Utils.rotate90DX(Constante.cr),Constante.X8,Constante.Y1,null);
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
