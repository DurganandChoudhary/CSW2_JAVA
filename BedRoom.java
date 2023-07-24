class Room{
	int length;
	int breadth;
	
	Room(int x,int y)
	{
		length=x;
		breadth=y;
	}
	int Area() {
	return(length*breadth);
	}
}
class BedRoom1 extends Room
{
	int height;
	public int volume1;
	public int area1;
	BedRoom1(int x,int y,int z)
	{
		super(x,y);
	    height=z;
}
     int volume()
{
	return(length*breadth*height);
}
	
}
public class BedRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BedRoom1 r1=new BedRoom1(14,12,10);
		r1.area1=r1.Area();
		r1.volume1=r1.volume();
		System.out.println("araea1="+area1);
		System.out.println("volume="+volume1);
		

	}

}
