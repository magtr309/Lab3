import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {


	public ColorPanel() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setBackground(Color.LIGHT_GRAY);

//FÄRGER
		this.add(new JLabel("Färger"));
		this.add(new ColorComponent(0, 0, Color.blue));
		this.add(new ColorComponent(0, 0, Color.red));
		this.add(new ColorComponent(0, 0, Color.orange));
		this.add(new ColorComponent(0, 0, Color.green));
		this.add(new ColorComponent(0, 0, Color.yellow));
		this.add(new ColorComponent(0, 0, Color.cyan));
		this.add(new ColorComponent(0, 0, Color.black));
		this.add(new ColorComponent(0, 0, Color.magenta));
		this.add(new ColorComponent(0, 0, Color.white));

		
	}

	public JPanel getColorPanel() {
		return this;
	}

}
