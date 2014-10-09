package flower;

import se.lth.cs.window.SimpleWindow;

import java.awt.Color;
import java.util.Random;

public class flowerV3 {
	public static void main(String[] args) {
		//Fönster
		SimpleWindow w = new SimpleWindow(600, 600, "Flower");
		w.setLineWidth(2);
		
		//Variabler för bakgrund
		int width = w.getWidth();
		double height = w.getHeight();
		double var = (360/height);
		Color c = null;
		
		// Variabler för blomma
		int x0 = w.getWidth() / 2;
		int y0 = w.getHeight() / 2;
		int mX = 0;
		int mY = 0;
		int radius = Math.min(x0, y0) - 20;
		int runRad = 0;
		int fat = 2;
		int leafs = 4;
		Color rndC = null;
		Random rnd = new Random();
		
		// Rita bakgrund
		for(int i = 0; i <= height; i++){
			double radian = var * Math.toRadians(i);
			int colVal =  (int) (Math.abs((255 * Math.sin(1 * radian))));
			c = new Color(colVal,colVal,colVal);
			w.setLineColor(c);
			w.moveTo(0, i);
			w.lineTo(width, i);
		}
		
		// Rita blommblad
		for (int j = 0; j < leafs; j++) {
			// I vilken vinkel bladet ska ritas
			double rot = j * Math.PI / (leafs/2);
			// Radien som vi kommer variera
			runRad = Math.min(x0, y0) - 20;
			// Vart ska vi sätta markören?
			mX = (int) (x0 + radius * Math.cos(rot));
			mY = (int) (y0 + radius * Math.sin(rot));
			w.moveTo(mX, mY);
			//Rita första halvan av blommblad
			for (int i = 0; i <= 45; i++) {
				// Random färg på strecket
				rndC = new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
				w.setLineColor(rndC);
				// Konvertera vinkeln i från grader till rad
				double angle = Math.toRadians(i);
				// Variera radien med sig självt ggr cos värdet för vinkeln 
				runRad = (int) (runRad * Math.cos(fat * angle));
				// Vilket blad vill vi rita?
				angle = Math.toRadians(i) + rot;
				// Rita nästa del av bladet
				int x = x0 + (int) Math.round(runRad * Math.cos(angle));
				int y = y0 + (int) Math.round(runRad * Math.sin(angle));
				w.lineTo(x, y);
				//SimpleWindow.delay(50);
			}
			
			// Radien som vi kommer variera
			runRad = Math.min(x0, y0) - 20;
			// Vart ska vi sätta markören?
			mY = (int) (x0 + radius * Math.cos(rot));
			mX = (int) (y0 + radius * Math.sin(rot));
			w.moveTo(mX, mY);
			//Rita andra halvan av blommblad
			for (int i = 0; i <= 45; i++) {
				// Random färg på strecket
				rndC = new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
				w.setLineColor(rndC);
				// Konvertera vinkeln i från grader till rad
				double angle = Math.toRadians(i);
				// Variera radien med sig självt ggr cos värdet för vinkeln
				runRad = (int) (runRad * Math.cos(fat * angle));
				// Vilket blad vill vi rita?
				angle = Math.toRadians(i) + rot;
				// Rita nästa del av bladet
				int x = x0 + (int) Math.round(runRad * Math.cos(angle));
				int y = y0 + (int) Math.round(runRad * Math.sin(angle));
				w.lineTo(y, x);
				//SimpleWindow.delay(50);
			}
		}
	}
}
