package array;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 7, 18, 71, 74, 65, 48, 23 };
		bubble(a);
	}

	public static void bubble(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}

