
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {
	private DrawingSurface drawingSurface;
	private JPanel southPanel;
	private JPanel rightPanel;
	private ColorPanel colorPanel;
    private Modell modell;
	public Window() {
		super("MS Paint 7.0 - A painting experience created by Magtr309 and Matpe306. Inspired by our love for art.");
		this.setSize(1000, 800);
		this.setLocation(500, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		// Southpanel w borderlayout w clear button
		southPanel = new JPanel(new BorderLayout());
		southPanel.setBackground(Color.red);
		southPanel.setPreferredSize(new Dimension(getSize().width, 30));
		this.add(southPanel, BorderLayout.SOUTH);
		JButton clearButton = new JButton("Clear");
		southPanel.add(clearButton, BorderLayout.WEST);
		

		// Rightpanel w borderlayout w colorPanel
		rightPanel = new JPanel();
		//rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		rightPanel.setLayout(new BorderLayout());
		rightPanel.setBackground(Color.LIGHT_GRAY);
		rightPanel.setPreferredSize(new Dimension(50, getSize().height));
		this.add(rightPanel, BorderLayout.EAST);
        colorPanel = new ColorPanel(modell);
		rightPanel.add(colorPanel.getColorPanel(), BorderLayout.NORTH);

	

		DrawingSurface drawingSurface = new DrawingSurface();
		this.add(drawingSurface);
		this.setVisible(true);

	}

}