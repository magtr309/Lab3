
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {
	private int x;
	private int y;
	private Color epicColor;
	
	
	public Rectangle(int x, int y, Color epicColor) {
		super(x, y, epicColor);
		this.x = x;
		this.y = y;
		this.epicColor = epicColor;
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(epicColor);
		g.fillRect(x, y, 50, 50);

	}

	@Override
	public void makeColor(Color epicColor) {
		// TODO Auto-generated method stub

	}

}
