abstract class Shape
{
	abstract double area();
}
class Square extends Shape
{
	int a;
	void setA(int a)
	{
		this.a=a;
	}
	double area()
	{
		return a*a;
	}
}
class Triangle extends Shape
{
	int b,h;
	void setB(int b)
	{
		this.b=b;
	}
	void setH(int h)
	{
		this.h=h;
	}
	double area()
	{
		return 0.5*b*h;
	}
}
class Circle extends Triangle
{
	int r;
	void setR(int r)
	{
		this.r=r;
	}
	double area()
	{
		return 3.141*r*r;
	}
}
public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s=new Square();
		s.setA(7);
		System.out.println("Area of Square ="+s.area());
		
		Triangle t=new Triangle();
		t.setB(9);
		t.setH(8);
		System.out.println("Area of Triangle="+t.area());
		
		Circle c=new Circle();
		c.setR(7);
		System.out.println("Area of Circle ="+c.area());

	}

}
