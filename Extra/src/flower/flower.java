package flower;

import se.lth.cs.window.SimpleWindow;

public class flower {
	public static void main(String[] args) {
		SimpleWindow w = new SimpleWindow(800, 800, "Flower");
		int x0 = w.getWidth() / 2;
		int y0 = w.getHeight() / 2;
		int radius = Math.min(x0, y0) - 20;
		int fat = 2;
		
		int runRad = Math.min(x0, y0) - 20;
		w.moveTo(x0 + radius, y0);
		for (int i = 0; i <= 45; i++) {
			double angle = Math.toRadians(i);
			runRad = (int) (runRad * Math.cos(fat * angle));
			int x = x0 + (int) Math.round(runRad * Math.cos(angle));
			int y = y0 + (int) Math.round(runRad * Math.sin(angle));
			w.lineTo(x, y);
		}
		w.moveTo(x0 + radius, y0);
		runRad = Math.min(x0, y0) - 20;
		for (int i = 0; i <= 45; i++) {
			double angle = Math.toRadians(i);
			runRad = (int) (runRad * Math.cos(fat * angle));
			int x = x0 + (int) Math.round(runRad * Math.cos(angle));
			int y = y0 - (int) Math.round(runRad * Math.sin(angle));
			w.lineTo(x, y);
		}
		w.moveTo(x0 - radius, y0);
		runRad = Math.min(x0, y0) - 20;
		for (int i = 0; i <= 45; i++) {
			double angle = Math.toRadians(i);
			runRad = (int) (runRad * Math.cos(fat * angle));
			int x = x0 - (int) Math.round(runRad * Math.cos(angle));
			int y = y0 - (int) Math.round(runRad * Math.sin(angle));
			w.lineTo(x, y);
		}
		w.moveTo(x0 - radius, y0);
		runRad = Math.min(x0, y0) - 20;
		for (int i = 0; i <= 45; i++) {
			double angle = Math.toRadians(i);
			runRad = (int) (runRad * Math.cos(fat * angle));
			int x = x0 - (int) Math.round(runRad * Math.cos(angle));
			int y = y0 + (int) Math.round(runRad * Math.sin(angle));
			w.lineTo(x, y);
		}
		
		w.moveTo(x0, y0+radius);
		runRad = Math.min(x0, y0) - 20;
		for (int i = 0; i <= 45; i++) {
			double angle = Math.toRadians(i);
			runRad = (int) (runRad * Math.cos(fat * angle));
			int y = x0 + (int) Math.round(runRad * Math.cos(angle));
			int x = y0 + (int) Math.round(runRad * Math.sin(angle));
			w.lineTo(x, y);
		}
		w.moveTo(x0, y0+radius);
		runRad = Math.min(x0, y0) - 20;
		for (int i = 0; i <= 45; i++) {
			double angle = Math.toRadians(i);
			runRad = (int) (runRad * Math.cos(fat * angle));
			int y = x0 + (int) Math.round(runRad * Math.cos(angle));
			int x = y0 - (int) Math.round(runRad * Math.sin(angle));
			w.lineTo(x, y);
		}
		w.moveTo(x0, y0-radius);
		runRad = Math.min(x0, y0) - 20;
		for (int i = 0; i <= 45; i++) {
			double angle = Math.toRadians(i);
			runRad = (int) (runRad * Math.cos(fat * angle));
			int y = x0 - (int) Math.round(runRad * Math.cos(angle));
			int x = y0 - (int) Math.round(runRad * Math.sin(angle));
			w.lineTo(x, y);
		}
		w.moveTo(x0, y0-radius);
		runRad = Math.min(x0, y0) - 20;
		for (int i = 0; i <= 45; i++) {
			double angle = Math.toRadians(i);
			runRad = (int) (runRad * Math.cos(fat * angle));
			int y = x0 - (int) Math.round(runRad * Math.cos(angle));
			int x = y0 + (int) Math.round(runRad * Math.sin(angle));
			w.lineTo(x, y);
		}
	}
}
