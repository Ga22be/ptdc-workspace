package mandelbrot;

import java.awt.Color;

import se.lth.cs.ptdc.fractal.MandelbrotGUI;

public class Generator {
	//alla todos med (förbättring) är saker som kan göras men inte är jättenödvändiga
	//TODO (förbättring) ta bort onödiga sysos
	//TODO KOMMENTARER -.-
	Color[][] gradients = new Color[256][4];
	int iterations = 200;
	
	enum ColorValue{
		HSB,
		RED,
		GREEN,
		BLUE
	}
	ColorValue currentColor;

	public Generator() {
		//Skapar och fyller color[intensitet][färg]
		//TODO (förbättring) snyggare färger?
		currentColor = ColorValue.RED;
		for (int i = 0; i<gradients.length; i++){
			gradients[i][ColorValue.HSB.ordinal()] = Color.getHSBColor(i/(float)gradients.length, 1, 1);
		}
		for (int i = 0; i < 256; i++) {
			gradients[i][ColorValue.RED.ordinal()] = new Color(211, i, 0);
		}
		for (int i = 0; i < 256; i++) {
			gradients[i][ColorValue.GREEN.ordinal()] = new Color(39, 255-i, 96);
		}
		for (int i = 0; i < 256; i++) {
			gradients[i][ColorValue.BLUE.ordinal()] = new Color(46, (int)(204/(double)255*i), 113);
		}
	}

	/** Renderar mandelbrot och ritar upp det i MandelbrotGUI */
	public void render(MandelbrotGUI gui) {
		// Avaktiverar m�jligheterna till input i gui uf�r att f�rhindra att en
		// �ndring f�r renderingen att bugga ur
		gui.disableInput();
		/** BÖRJAR TOLKA INPUT */
		// Tolkar input: Vilken upplösning �nskas?
		int pixelWidth;
		int pixelHeight;
		switch (gui.getResolution()) {
		case MandelbrotGUI.RESOLUTION_VERY_HIGH:
			pixelHeight = 1;
			break;
		case MandelbrotGUI.RESOLUTION_HIGH:
			pixelHeight = 3;
			break;
		case MandelbrotGUI.RESOLUTION_MEDIUM:
			pixelHeight = 5;
			break;
		case MandelbrotGUI.RESOLUTION_LOW:
			pixelHeight = 7;
			break;
		case MandelbrotGUI.RESOLUTION_VERY_LOW:
			pixelHeight = 9;
			break;
		default:
			pixelHeight = 1;
		}
		pixelWidth = pixelHeight;

		// Tolkar input: Svartvit eller gradient?
		boolean blackAndWhite;
		switch (gui.getMode()) {
		case MandelbrotGUI.MODE_BW:
			blackAndWhite = true;
			break;
		case MandelbrotGUI.MODE_COLOR:
			blackAndWhite = false;
			break;
		default:
			blackAndWhite = true;
		}
		
		// Tolkar input: (extrarutan)
		/**
		 * delar up texten i extrarutan i olika kommandon med olika värden till
		 * exempel: 
		 * "iterationer=300"
		 * "iterationer=400 color=red"
		 * */
		String extra = gui.getExtraText();
		String extras[] = extra.split(" ");
		boolean colorChanged = false;
		boolean iterationsChanged = false;
		for (int i = 0; i < extras.length; i++) {
			String current[] = extras[i].split("=");
			if (current.length > 1) {
				String command = current[0];
				String value = current[1];
				
				switch (command){
				case "iterations":
				case "iterationer":
				case "itt":
					iterations = Integer.parseInt(value);
					iterationsChanged = true;
					break;
				case "color":
				case "färg":
				case "col":
					colorChanged = true;
					switch (value){
					case "red":
					case "röd":
						currentColor = ColorValue.RED;
						break;
					case "green":
					case "grön":
						currentColor = ColorValue.GREEN;
						break;
					case "blue":
					case "blå":
						currentColor = ColorValue.BLUE;
						break;
					case "hsb":
					case "hsv":
						currentColor = ColorValue.HSB;
						break;
					default:
						System.err.println("Kunde inte tolka färgargumentet: " + value);
						currentColor = ColorValue.RED;
					}
					break;
				default:
					System.err.println("Kunde inte tolka kommandot: " + command);
				}
			}
			else if(!extra.isEmpty()){
				System.err.println("Kunde inte tolka extrarutan:" + extra);
			}
			// Set color to default when not specified in extra
			if (!colorChanged){
				currentColor = ColorValue.RED;
			}
			// Set iterations to default when not specified in extra
			if (!iterationsChanged){
				iterations = 200;
			}
		}
		/** KLAR MED ATT TOLKA INPUT */

		/**
		 * Anropar mesh f�r att f� en matris med representationer av
		 * komplexa tal f�r var enskilld pixel p� ritytan.
		 */
		Complex complex[][] = mesh(gui.getMinimumReal(), gui.getMaximumReal(),
				gui.getMinimumImag(), gui.getMaximumImag(), gui.getWidth(),
				gui.getHeight());

		/**
		 * Skapar en f�rgmatris som representerar pixlarna som ska ritas i
		 * gui. Pixlarnas storlek s�tts i f�rh�llande till uppl�sningen.
		 */
		int heightSize = getMaxArrayIndex(gui.getHeight(), pixelHeight);
		int widthSize = getMaxArrayIndex(gui.getWidth(), pixelHeight);
		Color[][] picture = new Color[heightSize][widthSize];

		/** Generate colorarray from complexarray */
		/** Ger var och en av pixlarna i f�rgmatrisen "picture" en f�rg */
		for (int y = 0; y < heightSize; y++) {
			// y-v�rdet f�r den komplexa punkten i mitten av pixeln i
			// f�rgmatrisen
			int jumpY = (pixelHeight / 2) + (y * pixelHeight);

			// Fixar out of bounds exception f�r h�jd
			if (jumpY >= gui.getHeight()) {
				jumpY = gui.getHeight() - 1;
			}

			for (int x = 0; x < widthSize; x++) {
				// x-v�rdet f�r den komplexa punkten i mitten av pixeln i
				// f�rgmatrisen
				int jumpX = (pixelWidth / 2) + (x * pixelWidth);

				// Fixar out of bounds exception f�r bredd
				if (jumpX >= gui.getWidth()) {
					jumpX = gui.getWidth() - 1;
				}

				// Ger pixeln picture sin f�rg beroende p� mandelbrotsm�ngden
				picture[y][x] = generateMandelColor(complex[jumpY][jumpX],
						blackAndWhite);
			}

		}
		// S�nder f�rgmatrisen och dess pixelstorlek till gui f�r rendering i
		// f�nstret
		gui.putData(picture, pixelWidth, pixelHeight);

		// �teraktiverar input
		gui.enableInput();
	}


	/** Skapar en matris av komplexa tal som motsvarar pixlarna i ritfönstret */
	private Complex[][] mesh(double minRe, double maxRe, double minIm,
			double maxIm, int width, int height) {
		Complex[][] pixelArray = new Complex[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				// Ber�kna pixeln i fr�gas relativa avst�nd till v�nstra kanten
				// av f�nstret
				double widthPercent = j / (double) width;
				// Ger re v�rdet av: minRe (vilket �r v�nstra kanten) och
				// adderar med avst�ndet mellan minRe och maxRe multiplicerat
				// med det relativa avst�ndet till v�nstra kanten
				double re = minRe + widthPercent * (maxRe - minRe);

				// Samma procedur fas f�r den imagin�ra delen och h�jden
				double heightPercent = i / (double) height;
				double im = maxIm - heightPercent * (maxIm - minIm);
				pixelArray[i][j] = new Complex(re, im);
			}
		}
		return pixelArray;
	}

	/**
	 * Ber�knar hur m�nga rader/kolumner du b�r skapa i f�rgmatrisen
	 * f�r en viss uppl�sning
	 */
	private int getMaxArrayIndex(int distance, int res) {
		int calc;
		int diff = distance % res;
		if (diff != 0) {
			calc = distance + (res - diff);
		} else {
			calc = distance;
		}
		calc = calc / res;

		return calc;
	}

	/** Best�mmer f�rgen f�r en pixel beroende p� ett givet komplext tal */
	private Color generateMandelColor(Complex c, boolean blackAndWhite) {
		Complex z = new Complex(0, 0);
		Color color = Color.BLACK;
		int index;
		double indexStep = iterations / (double)(gradients.length-1);

		// Ber�knar mandelbrot f�r givet komplext tal med givet antal
		// iterationer
		for (int i = 0; i < iterations; i++) {
			z.mul(z);
			z.add(c);
			if (z.getAbs2() > 2) {
				if (blackAndWhite) {
					color = Color.WHITE;
				} else {
					// Ber�knar vilken av f�rgerna i vektorn "colors" vi vill
					// anv�nda
					index = (int) Math.round(i / indexStep);
					// Anv�nder den f�rgen
					color = gradients[index][currentColor.ordinal()];
				}
				break;
			}
		}
		return color;
	}

}