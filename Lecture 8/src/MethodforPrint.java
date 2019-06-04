
public class MethodforPrint {
	public static void main(String[] args) {
//		Да се състави метод, който приема като аргументи два масива и
//		връща масив, съдържащ всички елементи на двата подадени
//		масива.
		
		int[] arr1= {1,2,3,4};
		int[] arr2= {1,2,3,5};
		arrSum(arr1,arr2);
		 
	}
	 static void  arrSum(int[]arr1,int[]arr2) {
		int [] arr=new int[arr1.length+arr2.length];
		for (int i=0;i<arr1.length;i++) {
			arr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr[arr1.length-1+(i+1)]=arr2[i];
			
		}
		
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			if (i==arr.length-1) {
				System.out.print(arr[i]+ "]");
			}
			else {
				System.out.print(arr[i]+", ");
			}
		}
	}

}
