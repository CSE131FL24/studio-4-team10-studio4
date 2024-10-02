package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5,0.5,0.5,0.3636);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.5, 0.5, 0.15);
	}
}