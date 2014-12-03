package lab8_9;

import java.awt.Color;
import se.lth.cs.ptdc.images.ImageFilter;

/** IdentityFilter beskriver en identitetstransformation */
public class ContrastFilter extends ImageFilter {
	private Color[] greyScale = new Color[256];

	public ContrastFilter(String name) {
		super(name);
		for (int i = 0; i < greyScale.length; i++) {
			greyScale[i] = new Color(i, i, i);
		}
	}

	public Color[][] apply(Color[][] inPixels, double paramValue) {
		int height = inPixels.length;
		int width = inPixels[0].length;
		short[][] intensity = computeIntensity(inPixels);
		int[] histogram = new int[256];
		Color[][] outPixels = new Color[height][width];

		double cutOff = paramValue;
		int lowCut = 0;
		int highCut = 255;
		int lowSum = 0;
		int highSum = 0;
		int newIntensity;

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				histogram[intensity[i][j]]++;
			}
		}

		while (cutOff * height * width > lowSum
				|| cutOff * height * width > highSum) {
			if (cutOff * height * width > lowSum) {
				lowSum += histogram[lowCut++];
			}
			if (cutOff * (height * width) > highSum) {
				highSum += histogram[highCut--];
			}
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (intensity[i][j] >= lowCut && intensity[i][j] <= highCut) {
					newIntensity = 255 * (intensity[i][j] - lowCut)
							/ (highCut - lowCut);
				} else if (intensity[i][j] < lowCut) {
					newIntensity = 0;
				} else {
					newIntensity = 255;
				}
				outPixels[i][j] = greyScale[newIntensity];
			}
		}
		return outPixels;
	}
}
