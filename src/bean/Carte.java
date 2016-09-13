package bean;

import java.awt.image.BufferedImage;

import utils.Utils;

public class Carte {

	private int valeur;
	private boolean discovered;
	private BufferedImage image;
	
	public Carte(int valeur) {
		this.setValeur(valeur);
		this.discovered=false;
	}
	
	public Carte(int valeur, BufferedImage image) {
		this(valeur);
		this.image=image;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public boolean isDiscovered() {
		return discovered;
	}

	public void setDiscovered(boolean discovered) {
		this.discovered = discovered;
	}

	public BufferedImage getImage() {
		return image;
	}
	
	public BufferedImage getImageTurned() {
		return Utils.rotate90DX(image);
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
}
