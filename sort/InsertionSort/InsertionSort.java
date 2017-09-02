import java.util.Scanner;
import java.util.Arrays;

class InsertionSort {
	public static void main (String args []) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int n = reader.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++){
			System.out.println("Enter element #" + (i + 1) + " : ");
			a[i] = reader.nextInt();
		}
		for (int j = 1; j <= n-1; j++){
			int key = a[j];
			int i = j-1;
			while(i>=0 && a[i]>key){
				a[i+1]=a[i];
				a[i]=key;
				i = i-1;
			}
		}
		System. out. println ("Sorted array: " + Arrays.toString(a));
	}
}