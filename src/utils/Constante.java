package utils;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Constante {
	
	public final static int IM_COVER = 1279;
	public final static int IM_AS = 0;
	public final static int IM_2 = 98;
	public final static int IM_3 = 196;
	public final static int IM_4 = 295;
	public final static int IM_5 = 393;
	public final static int IM_6 = 492;
	public final static int IM_7 = 590;
	public final static int IM_8 = 689;
	public final static int IM_9 = 787;
	public final static int IM_10 = 886;
	public final static int IM_V = 984;
	public final static int IM_D = 1083;
	public final static int IM_R = 1181;
	
	public final static int CARD_HEIGHT = 143;
	public final static int CARD_WIDTH = 99;
	
	public final static String PATH_IM_CARDSHEET = "resources/img/sheetcard.png";
	public final static String PATH_IM_BACKGROUND = "resources/img/tapis.png";
	public final static String PATH_IM_COURONNE = "resources/img/couronne.jpg";
	
	public static BufferedImage bg, c0, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, cv, cd ,cr, couronne;
	
	static {
		try {
			bg = ImageIO.read(new File(PATH_IM_BACKGROUND));
			c0 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_COVER, 0, CARD_WIDTH, CARD_HEIGHT);
	        c1 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_AS, 0, CARD_WIDTH, CARD_HEIGHT);
	        c2 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_2, 0, CARD_WIDTH, CARD_HEIGHT);
	        c3 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_3, 0, CARD_WIDTH, CARD_HEIGHT);
	        c4 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_4, 0, CARD_WIDTH, CARD_HEIGHT);
	        c5 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_5, 0, CARD_WIDTH, CARD_HEIGHT);
	        c6 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_6, 0, CARD_WIDTH, CARD_HEIGHT);
	        c7 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_7, 0, CARD_WIDTH, CARD_HEIGHT);
	        c8 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_8, 0, CARD_WIDTH, CARD_HEIGHT);
	        c9 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_9, 0, CARD_WIDTH, CARD_HEIGHT);
	        c10 = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_10, 0, CARD_WIDTH, CARD_HEIGHT);
	        cv = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_V, 0, CARD_WIDTH, CARD_HEIGHT);
	        cd = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_D, 0, CARD_WIDTH, CARD_HEIGHT);
	        cr = ImageIO.read(new File(PATH_IM_CARDSHEET)).getSubimage(IM_R, 0, CARD_WIDTH, CARD_HEIGHT);
	        couronne = ImageIO.read(new File(PATH_IM_COURONNE));
			
		} catch (Exception iOException) {System.out.println("Error while getting images");}
	}
	
	public final static int X1 = 157;
	public final static int X2 = 244;
	public final static int X3 = 266;
	public final static int X4 = 397;
	public final static int X5 = 419;
	public final static int X6 = 441;
	public final static int X7 = 572;
	public final static int X8 = 594;
	public final static int X9 = 725;
	
	public final static int Y1 = 144;
	public final static int Y9 = 211;
	public final static int Y2 = 365;
	public final static int Y3 = 253;
	public final static int Y4 = 364;
	public final static int Y5 = 408;
	public final static int Y6 = 517;
	public final static int Y7 = 561;
	public final static int Y8 = 670;
	
	public final static int X_GAP = 10;
	public final static int X_MARGIN_GAUCHE = 157;
	public final static int X_MARGIN_DROITE = 158;
	
	public final static int Y_GAP = 10;
	public final static int Y_MARGIN_HAUT = 134;
	public final static int Y_MARGIN_BAS = 135;
	
	
}
