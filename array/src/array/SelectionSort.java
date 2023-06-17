package array;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = { 7, 18, 71, 74, 65, 48, 23 };
		selection(a);
	}

	public static void selection(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
