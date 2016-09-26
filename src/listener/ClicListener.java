package listener;

import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import bean.Game;
import utils.Constante;
import utils.Utils;

public class ClicListener implements MouseListener {
	
	private JPanel p;
	private Game g;
	
	public ClicListener(JPanel p, Game g) {
		super();
		this.setP(p);
		this.setG(g);
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
		int gerard = getCarteCoord(arg0.getX(), arg0.getY());
		switch(gerard) {
			case 1: System.out.println("Clic sur carte 1");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(Utils.rotate90DX(g.getListCartes().get(gerard-1).getImage()),Constante.X6,Constante.Y1,null);
					break;
			case 2: System.out.println("Clic sur carte 2");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(Utils.rotate90DX(g.getListCartes().get(gerard-1).getImage()),Constante.X8,Constante.Y1,null);
					break;
			case 3: System.out.println("Clic sur carte 3");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(Utils.rotate90DX(g.getListCartes().get(gerard-1).getImage()),Constante.X3,Constante.Y5,null);
					break;
			case 4: System.out.println("Clic sur carte 4");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(Utils.rotate90DX(g.getListCartes().get(gerard-1).getImage()),Constante.X5,Constante.Y5,null);
					break;
			case 5: System.out.println("Clic sur carte 5");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(Utils.rotate90DX(g.getListCartes().get(gerard-1).getImage()),Constante.X7,Constante.Y5,null);
					break;
			case 6: System.out.println("Clic sur carte 6");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(Utils.rotate90DX(g.getListCartes().get(gerard-1).getImage()),Constante.X2,Constante.Y8,null);
					break;
			case 7: System.out.println("Clic sur carte 7");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(Utils.rotate90DX(g.getListCartes().get(gerard-1).getImage()),Constante.X4,Constante.Y8,null);
					break;
			case 8: System.out.println("Clic sur carte 8");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(g.getListCartes().get(gerard-1).getImage(),Constante.X1,Constante.Y9,null);
					break;
			case 9: System.out.println("Clic sur carte 9");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(g.getListCartes().get(gerard-1).getImage(),Constante.X1,Constante.Y4,null);
					break;
			case 10: System.out.println("Clic sur carte 10");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(g.getListCartes().get(gerard-1).getImage(),Constante.X6,Constante.Y3,null);
					break;
			case 11: System.out.println("Clic sur carte 11");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(g.getListCartes().get(gerard-1).getImage(),Constante.X6,Constante.Y6,null);
					break;
			case 12: System.out.println("Clic sur carte 12");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(g.getListCartes().get(gerard-1).getImage(),Constante.X9,Constante.Y5,null);
					break;
			case 13: System.out.println("Clic sur carte 13");
					this.g.getListCartes().get(gerard-1).setDiscovered(true);
					this.p.getGraphics().drawImage(g.getListCartes().get(gerard-1).getImage(),Constante.X9,Constante.Y7,null);
					break;
			default: break;
		}
		if(!g.getListCartes().get(gerard).isDiscovered()) {
			int valCarte = g.getListCartes().get(gerard).getValeur();
			if(valCarte == g.getCurrentTour().getMontantDes()) {
				// TODO END TOUR
				// Reset Plateau
				// Nouveau tour (index++) if Exception index=0
			} else if(valCarte == 1) {
				g.getCurrentTour().setGorgeesAcquises(0);
			} else if(valCarte == g.getCurrentTour().getP().getNumCarte()) {
				// TODO EFFET SPECIAL
			}
		} else {
			JOptionPane.showMessageDialog(null, "Carte déjà retournée. +1 gorgée pour avoir essayé de faire planté le programme. Bâtard.", "Error Boloss 404", JOptionPane.ERROR_MESSAGE);
			g.getCurrentTour().setGorgeesAcquises(g.getCurrentTour().getGorgeesAcquises()+1);
		}
		g.getListCartes().get(gerard).setDiscovered(true);
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent arg0) {
	}

	public JPanel getP() {
		return p;
	}

	public void setP(JPanel p) {
		this.p = p;
	}

	public Game getG() {
		return g;
	}

	public void setG(Game g) {
		this.g = g;
	}

}
