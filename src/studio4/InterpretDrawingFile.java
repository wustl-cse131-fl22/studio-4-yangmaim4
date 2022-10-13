package studio4;

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
		String shape=in.next();
		int red=in.nextInt();
		int green=in.nextInt();
		int blue=in.nextInt();
		boolean filled=in.nextBoolean();
		if (shape.equals("rectangle"))
		{
			double x1=in.nextDouble();
			double y1=in.nextDouble();
			double x2=in.nextDouble();
			double y2=in.nextDouble();
			StdDraw.clear();
			StdDraw.setPenColor(red, green, blue);
			StdDraw.filledRectangle(x1, y1, x2, y2);
		}
		else if (shape.equals("triangle"))
		{
			double[] x=new double[3];
			double[] y=new double[3];
			for (int i=0;i<3;i++)
			{
				x[i]=in.nextDouble();
				y[i]=in.nextDouble();
			}
			StdDraw.clear();
			StdDraw.setPenColor(red, green, blue);
			StdDraw.filledPolygon(x, y);
		}
	}
}
