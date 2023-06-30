class point
{
	private int x_coordinate,y_coordinate;
	point(int x, int y)
	{
		x_coordinate=x;
		y_coordinate=y;
	}
	void display()
	{
		System.out.println("x"+" "+"y");
	}
}
class Circle extends point
{
    double radius,circle;
	Circle(double x, double y,double z,double zz) {
		super(x, y);
		radius=z;
	}
	
	
}

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
