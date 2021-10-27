package mock;

public class AreaService {
	private IShape iShape;
	
	public double CalculateArea() {
		return iShape.CalculateArea();
	}
	public void setShape(IShape iShape) {
		this.iShape = iShape;
	}
	public IShape getShape() {
		return iShape;
	}
}
