package array;

public class LargestNo {
public static void main(String[] args) {
	int a[]= {56,78,97,95,34,32};
	System.out.println(largest(a));
	
}
	public static int largest(int arr[]) {
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];
		}
	}
	return largest;
}
	
	

}
