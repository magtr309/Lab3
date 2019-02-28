import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;

public class ColorComponent extends JComponent {
	private int x;
	private int y;
	private Color epicColor;
	private Modell modell;
	
	
	// myslyssnare
	public ColorComponent(int x, int y, Color epicColor) {
		this.setPreferredSize(new Dimension(40,40));
			this.x = x = 0;
			this.y = y = 0;
			this.epicColor = epicColor;
	}
	

	public void mouseClicked(MouseEvent e) {
		System.out.println("FÄRGVAL!!!" + e.getX() + "," + e.getY());
		modell.makeColor(epicColor);
	}
	@Override
	public void paintComponent(Graphics g) {
            g.setColor(epicColor);
            g.fillRect(x, y, 50, 50);
	}
}
