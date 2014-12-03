package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class GausFilter extends ImageFilter {
	public GausFilter(String name) {
		super(name);
	}
	
	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		Color[][] outPixels = new Color[height][width];
		short[][] red = new short[height][width];
		short[][] green = new short[height][width];
		short[][] blue = new short[height][width];		
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];			
				red[i][j] = (short) pixel.getRed();
				green[i][j] = (short) pixel.getGreen();
				blue[i][j] = (short) pixel.getBlue();
			}
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if(i > 1 && i < height-1 && j > 1 && j < width-1){
					int redVal = convolve(red, i, j, GAUSS_KERNEL, 8);
					int greenVal = convolve(green, i, j, GAUSS_KERNEL, 8);
					int blueVal = convolve(blue, i, j, GAUSS_KERNEL, 8);
					outPixels[i][j] = new Color(redVal, greenVal, blueVal);
				} else {
					outPixels[i][j] = inPixels[i][j];
					// outPixels[i][j] = Color.BLACK;
				}
			}
		}		
		return outPixels;
	}
	
	private static short[][] GAUSS_KERNEL =
		{ {0, 1, 0},
		  {1, 4, 1},
		  {0, 1, 0} };
}
