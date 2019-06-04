import java.util.Arrays;

public class Examples {
	public static void main(String[] args) {
		int []arr=new int [9];
		fillRec(arr, 0);
		System.out.println(Arrays.toString(arr));
	}
	static void fillRec(int [] arr, int i) {
		if(i==arr.length) {
			return;
		}
		else {
		 arr[i]=i;
		 fillRec(arr, i+1);
		 
	}
		
	}
}
