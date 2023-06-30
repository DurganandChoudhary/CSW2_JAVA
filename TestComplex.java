class complex
{
	int real;
	int imag;
	void setcomplex(int r,int i)
	{
		real=r;
		imag=i;
	}
	void display()
	{
		System.out.println(real+"+"+"i"+imag);
	}
}
public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complex c1=new complex();
		complex c2=new complex();
		
		c1.setcomplex(7,9);
		c2.setcomplex(9,8);
		
		complex c3=add(c1,c2);
		System.out.print("Result=");
		c3.display();

	}

	public static complex add(complex a, complex b) {
		// TODO Auto-generated method stub
		complex c=new complex();
		c.real=a.real+b.real;
		c.imag=a.imag+b.imag;
		return c;
	}

}
