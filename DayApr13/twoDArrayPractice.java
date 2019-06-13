package DayApr13;

public class twoDArrayPractice {
	public static void main(String[] args) {
		
		int[][] nums= {{1,2,3},{4,5},{7,8,9}};
		for(int[] row:nums)
		{
			for(int cell:row)
			{
				cell=cell*2;
				System.out.print(cell+" ");
			}
			System.out.println();
		}
	}

}
