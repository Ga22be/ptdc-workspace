package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class InvertionFilter extends ImageFilter {
	public InvertionFilter(String name) {
		super(name);
	}
	
	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];			
				outPixels[i][j] = new Color(255-pixel.getRed(), 
										    255-pixel.getGreen(),
										    255-pixel.getBlue());
			}
		}
		return outPixels;
	}
}
