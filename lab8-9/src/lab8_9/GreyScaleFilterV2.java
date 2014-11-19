package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class GreyScaleFilterV2 extends ImageFilter {
	public GreyScaleFilterV2(String name) {
		super(name);
	}
	
	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		int intensity;
		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				Color pixel = inPixels[i][j];	
				intensity = Math.round(((pixel.getRed()+pixel.getGreen()+pixel.getBlue())/3));
				outPixels[i][j] = new Color(intensity, 
											intensity,
											intensity);
			}
		}
		return outPixels;
	}
}
