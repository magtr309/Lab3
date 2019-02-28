
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
	// MyMouseListener myMouseListener = new MyMouseListener();
	private Modell modell;
	private DrawingSurface drawingSurface;

	public MyMouseListener(Modell modell, DrawingSurface drawingSurface) {
		this.modell = modell;
		this.drawingSurface = drawingSurface;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Vi klickade i komponenten! på " + e.getX() + "," + e.getY());
		modell.addShape(e.getX(), e.getY());
		drawingSurface.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
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

}
