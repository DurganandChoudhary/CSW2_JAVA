package karan;

public class p16 {

	public static void main(String[] args) {
	int num =3;
	System.out.println("The sequence of moves are :\n");
	towerofhanoi(num,'A','C','B');
	}
	public static void towerofhanoi(int num,char src,char dst,char temp)
	{
		if(num<1)
		{
			return;
		}
		towerofhanoi(num-1,src,temp,dst);
		System.out.println("move"+num+"disk from peg"+src+"to peg"+dst);
		towerofhanoi(num-1,temp,dst,src);
		
	}
	
	}


