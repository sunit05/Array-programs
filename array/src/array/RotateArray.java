package array;

public class RotateArray {

	public static void main(String[] args) {
		int a[] = { 3, 4, 6, 3, 5, 4, 5 };
		int n = 2;
		int s[] = leftRotate(a,n);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
	}

	public static int[] leftRotate(int arr[], int n) {
		for (int j = 0; j < n; j++) {
			int first=arr[0];
			int i=0;
			for (i = 0; i < arr.length-1; i++) {
				arr[i]=arr[i+1];
			}
			arr[i]=first;
		}
		return arr;
	}
}
