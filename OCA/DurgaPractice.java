package OCA;
import java.util.Arrays;
public class DurgaPractice {

	public static void main(String[] args) {
		int[] arr= {1,5,2,4,6,7,8,9,10}; 
		int a=0;
		    Arrays.sort(arr);
		    System.out.println(Arrays.toString(arr));
		   
		      for(int j=0;j<9;j++){
		        if(arr[j]!=(j+1)){
		          a=arr[j];
		          a=a-1;
		          break;
	}
		  
		    }
		      System.out.println(a);
	}

}
