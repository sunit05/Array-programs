package array;

public class UniqueEle {
	
	public static void main(String[] args) {
		int a[]= {3,4,6,3,5,4,5};
		System.out.println(unique2(a));
	}
	
	public static int unique (int a[]){
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(i!=j) {
					temp=j;			
				}
			}
		}
		return temp;
	}
	
	public static int unique2(int arr[]) {
		int unique=arr[0];
		for(int i=1;i<arr.length;i++) {
			unique=unique^arr[i];
		}
		return unique;
	}
}
