
import java.awt.Color;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingSurface extends JPanel {
	private Modell modell = new Modell();
	//private DrawingSurface drawingSurface = new DrawingSurface();

	public DrawingSurface() {
		this.setBackground(Color.gray);
		this.addMouseListener(new MyMouseListener(modell, this));
		this.setVisible(true);
	}

	public Modell getModell() {
		return modell;
	}

	@Override
	public void paintComponent(Graphics g) {
		for (Shape s : modell.getShapeList()) {
			s.paintComponent(g);

		}
	}

}