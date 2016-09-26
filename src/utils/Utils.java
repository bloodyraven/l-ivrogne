package utils;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class Utils {

	public static BufferedImage rotate90DX(BufferedImage bi) {
	    int width = bi.getWidth();
	    int height = bi.getHeight();
	    BufferedImage biFlip = new BufferedImage(height, width, bi.getType());
	    for(int i=0; i<width; i++)
	        for(int j=0; j<height; j++)
	            biFlip.setRGB(height-1-j, width-1-i, bi.getRGB(i, j));
	    
	    AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
	    tx.translate(-biFlip.getWidth(null), 0);
	    AffineTransformOp op = new AffineTransformOp(tx,
	        AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
	    biFlip = op.filter(biFlip, null);
	    
	    return biFlip;
	}
	
}
