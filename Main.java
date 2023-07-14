abstract class Programming
{
	public abstract void Developers();
}
class HTML extends Programming
{
	//@Override
	public void Developers()
	{
		System.out.println("Tim Berners Lee");
	}
}
class Java extends Programming
{
	//@Override
	public void Developers()
	{
		System.out.println("James Gosling");
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HTML h=new HTML();
		h.Developers();
		Java j=new Java();
		j.Developers();

	}

}
