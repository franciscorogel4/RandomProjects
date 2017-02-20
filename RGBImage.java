
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

import java.util.Hashtable;

class RGBImage 
{
	
	BufferedImage image;
	int width;
	int height;

	static public void main(String args[]) throws Exception 
	{
		RGBImage obj = new RGBImage();	
	}

	public RGBImage() 
	{
		try 
		{			
			File input = new File("/Users/franciscorogel/Documents/RandomCodingProjects/src/ChicagoBlackhawkslogo.png");
			image = ImageIO.read(input);
			
			int[][] arrayRGB = new int [image.getHeight() * image.getWidth()][4];
			
			int count = 0;
			
	  		System.out.println("Printing a random set of value from the image(Should be nothing there right now): " + arrayRGB[102][2] );
			System.out.println(image.getHeight());
			System.out.println(image.getWidth());
			
			for(int i=0; i<image.getHeight(); i++)
			{
				for(int j=0; j<image.getWidth(); j++)
				{
					count++;
					Color color = new Color(image.getRGB(j, i));
					
					arrayRGB[count++][1] = color.getRed();					
					arrayRGB[count][2] = color.getGreen();
					arrayRGB[count][3] = color.getBlue();
				}
			}
	  		System.out.println("Printing a random set of value from the image(Should be nothing there right now): " + arrayRGB[102][2] );

			/*	
			int count = 0;

			for(int i=0; i<image.getHeight(); i++)
			{
				for(int j=0; j<image.getWidth(); j++)
				{
					count++;
					Color c = new Color(image.getRGB(j, i));
					System.out.println("S.No: " + count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
				}
			}*/
		} catch (Exception e) {}
		
	}
}	
