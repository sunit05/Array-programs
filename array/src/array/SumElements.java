package array;

public class SumElements {
	public static void main(String[] args) {
		int a[]= {1,3,6,2,5,4,3,2,4};
		int s=7;
		sum(a,s);
		System.out.println(sum(a,s));
	}
	
	public static int sum(int arr[],int k) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==k) {
					System.out.println(arr[i]+" and "+ arr[j]);
					count++;
		 		}
			}
		}
		return count;
	}
}
