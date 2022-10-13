package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0.2, 0.2, 0.2, 0.2);
		StdDraw.filledRectangle(0.8, 0.2, 0.2, 0.2);
		StdDraw.filledRectangle(0.8, 0.8, 0.2, 0.2);
		StdDraw.filledRectangle(0.2, 0.8, 0.2, 0.2);
	}
}