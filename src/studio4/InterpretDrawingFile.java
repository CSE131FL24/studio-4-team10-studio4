package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String Shape = in.next();
		
		System.out.println(Shape);
		
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		System.out.println(red +" "+ green + " "+ blue);
		
		boolean filled = in.nextBoolean();
		
		System.out.println(filled);
		
		Color color = new Color(red, green, blue);
		
		if(Shape == "rectangle") {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
		StdDraw.rectangle(x,y,halfWidth,halfHeight);
		}    else if(Shape == "ellipse") {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.ellipse(x,y,halfWidth,halfHeight);
		}
		else {
			double[] y = new double[3];
			double[] x = new double[3];
			for(int i = 1; i < 7; i++) {
				if( i % 2 == 0) {
				y[i-1] = in.nextDouble();
				} else {
				x[i-1] = in.nextDouble();
				}
			StdDraw.polygon(x, y);
			
				
			}
		}
	}
}




