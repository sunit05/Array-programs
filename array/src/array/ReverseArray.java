package array;

public class ReverseArray {
	public static void main(String[] args) {
		int a[] = { 7, 6, 4, 5, 2, 14, 16, 15 };
		int s[]=reverse(a);
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		//for-each loop
		for(int i:s) {
			System.out.print(s[i]+" ");
		}
		
	}

	public static int[] reverse(int arr[]) {
		int b[]=new int[arr.length];
		int k=0;
		for(int i=arr.length-1;i>=0;i--) {
			b[k++]=arr[i];
		}
		return b;
	}
	
	
}
