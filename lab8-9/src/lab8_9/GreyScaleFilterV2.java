package lab8_9;
import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class GreyScaleFilterV2 extends ImageFilter {
	Color[] greyScale = new Color[256];
	public GreyScaleFilterV2(String name) {
		super(name);
		for(int i = 0; i < greyScale.length; i++){
			greyScale[i] = new Color(i,i,i);
		}
	}
	
	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		short[][] intensity = super.computeIntensity(inPixels);
		Color[][] outPixels = new Color[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				outPixels[i][j] = greyScale[intensity[i][j]];
			}
		}
		return outPixels;
	}
}
