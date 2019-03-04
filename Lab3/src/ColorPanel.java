import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {

private Color cuteColor = Color.BLUE;

	public ColorPanel(Modell modell) {
		// Colorpanel w ColorComponents
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.LIGHT_GRAY);

		// Colors
		this.add(new JLabel("Colors"));
		this.add(new ColorComponent(0, 0, Color.red));
		this.add(new ColorComponent(0, 0, Color.orange));
		this.add(new ColorComponent(0, 0, Color.green));
		this.add(new ColorComponent(0, 0, Color.yellow));
		this.add(new ColorComponent(0, 0, Color.cyan));
		this.add(new ColorComponent(0, 0, Color.black));
		this.add(new ColorComponent(0, 0, Color.magenta));
		this.add(new ColorComponent(0, 0, Color.white));
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("New color!" + e.getX() + "," + e.getY());
				if (e.getY() < 55 && e.getY() > 15) {
					System.out.println("Red");
					modell.makeColor(cuteColor);
				} else if (e.getY() < 95 && e.getY() > 55) {
					System.out.println("Orange");
				} else if (e.getY() < 135 && e.getY() > 95) {
					System.out.println("green");
				} else if (e.getY() < 175 && e.getY() > 135) {
					System.out.println("yellow");
				} else if (e.getY() < 215 && e.getY() > 175) {
					System.out.println("cyan");
				} else if (e.getY() < 255 && e.getY() > 215) {
					System.out.println("black");
				} else if (e.getY() < 295 && e.getY() > 255) {
					System.out.println("magenta");
				} else if (e.getY() < 335 && e.getY() > 295) {
					System.out.println("white");
				}

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

	public JPanel getColorPanel() {
		return this;
	}

}
