
public class dgbhdjjhjcbbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoD[][]=new int[5][];
		twoD[0]=new int[1];
		twoD[1]=new int[2];
		twoD[2]=new int[3];
		twoD[3]=new int[4];
		twoD[4]=new int[5];
		
		int i,j,k=1;
		
		for(i=0;i<5;i++)
			for(j=0;j<i+1;j++) {
				twoD[i][j]=k;
				k++;
			}
		for(i=0;i<5;i++) {
			for(j=0;j<i+1;j++)
				System.out.print(twoD[i][j]+" ");
			System.out.println();
		}

	}

}
