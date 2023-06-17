package array;

public class SumOfNum {
	public static void main(String[] args) {
		int a[] = { 7, 6, 4, 5, 2, 14, 16, 15 };
		System.out.println(sumOfEven(a));
		System.out.println(sumOfOdd(a));
		System.out.println(diff(sumOfEven(a),sumOfOdd(a)));
		
	}

	public static int sumOfEven(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	
	public static int sumOfOdd(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	
	public static int diff(int even,int odd) {
		if(even>odd) {
			return even-odd; 
		}else {
			return odd-even;
		}
		
	}
}






