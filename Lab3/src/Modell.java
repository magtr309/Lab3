
import java.awt.Color;
import java.util.ArrayList;

public class Modell { // Håller reda på allt

	private ArrayList<Shape> shapeList = new ArrayList<>();
	private Color currentColor = Color.black;

	public Modell() {
		
	}

	
	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}

	public void setShapeList(ArrayList<Shape> shapes) {
		this.shapeList = shapes;
	}

	// l�gg till olika former, l�gg till rektangel och triangel h�r sen
	public void addShape(int x, int y) {
		Shape aShape = null;
		aShape = new Circle(x, y, currentColor);
		shapeList.add(aShape);
	}

	// TESTA UTAN
	public void makeColor(Color epicColor) {
		currentColor = epicColor;

	}
	
	
}