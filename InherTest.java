class Room
{
	int length;
	int breadth;
	
	Room(int x,int y)
	{
		length=x;breadth=y;
	}
	int area()
	{
		return (length*breadth);
	}
}
class BedRoom extends Room
{
	int height;
	BedRoom(int x,int y,int z)
	{
		super(x,y);
		height=z;
	}
     int volume()
     {
    	 return (length*breadth*height);
     }
}

public class InherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BedRoom r1=new BedRoom(14,12,10);
		int area1=r1.area();
		int volume1=r1.volume();
		System.out.println("area="+area1);
		System.out.println("volume= "+volume1);

	}

}
