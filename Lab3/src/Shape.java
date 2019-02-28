
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public abstract class Shape {

	private int x;
	private int y;
	private Color epicColor;

	public Shape(int x, int y, Color epicColor) {
	
		this.x = x;
		this.y = y;
		this.epicColor = epicColor;
	}
	
	public abstract void paintComponent(Graphics g);
		
	public abstract void makeColor (Color epicColor);

	

}
