package DayApr13;

public class twoDArray {
	public static void main(String[] args) {
		
		int[][] data=new int[4][2];
		data[0][0]=12;
		data[0][1]=17;
		data[1][0]=3;
		data[1][1]=40;
		data[2][0]=44;
		data[2][1]=27;
		data[3][0]=23;
		data[3][1]=12;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(data[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("_________________________________________________________________________");
		System.out.println("_________________________________________________________________________");
		System.out.println();
		
		int[] data1[]=new int[3][2];
		data1[0][0]=12;
		data1[0][1]=17;
		data1[1][0]=3;
		data1[1][1]=40;
		data1[2][0]=44;
		data1[2][1]=27;
		
		for(int[] eachRow :data1)
		{
			for(int eachCell: eachRow)
			{
				System.out.print(eachCell+" ");
			}
			System.out.println();
		}
		
		System.out.println("_________________________________________________________________________");
		System.out.println("_________________________________________________________________________");
		System.out.println();
		
		int data2[][]=new int[2][2];
		data2[0]=new int[] {1,2};
		data2[1]=new int[] {2,1};
		
		for(int a=0;a<2;a++)
		{
			for(int b=0;b<2;b++) {
				System.out.println("Row:"+a+" Column:"+b+" = "+data2[a][b]);
			}
			
		}
		
		
	}

}
