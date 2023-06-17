package array;

public class LinearSearch {
	public static void main(String[] args) {
		int a[] = { 3, 4, 6, 3, 4, 5 , 5 };
		int n=5;
		search(a,n);
	}
	
	public static void search(int arr[],int n) {

		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(n+" is at "+ (i+1) +" position");

			}
		}
		

	}
}
