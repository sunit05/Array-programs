package array;

public class EvenArray {
	public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,6,7,8,9};
//	System.out.println(countEven(a));
//	System.out.println(countOdd(a));
//	System.out.println(sumOfEven(a));
//	System.out.println(sumOfOdd(a));
	}

public static int countEven(int arr[]) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]+"is even");
			count++;
		}
	}
	System.out.println("there are "+count+" even numbers" );
	return count;
}

public  static int countOdd(int arr[]) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			System.out.println();
			System.out.println(arr[i]+"is odd");
			count++;
		}
	}
	System.out.println("there are "+count+" odd numbers" );
	return count;
}


public static int sumOfEven(int arr[]) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]);
			count+=arr[i];
		}
	}
	return count;
}


public static int sumOfOdd(int arr[]) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			System.out.println(arr[i]);
			count+=arr[i];
		}
	}
	return count;
}








}


















