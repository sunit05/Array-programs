package array;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {7,18,71,74,65,48,23};
		Arrays.sort(a);
		binary(a);
		
	}
	public static void binary(int arr[]) {
		int low = 0, high=arr.length;
		int key=65;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]== key) {
			System.out.println(mid+1);
			}
			else if(arr[mid]<key) {
				low=arr[mid+1];
			}
			else if(arr[mid]>key) {
				high=arr[mid-1];
			}
		}
		System.out.println("element not found");
	}
}
