package Week3;

import java.util.Scanner;

public class DifferenceArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of array:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        int[] diff = new int[n];

	        System.out.println("Enter array elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        diff[0] = arr[0];
	        for (int i = 1; i < n; i++) {
	            diff[i] = arr[i] - arr[i - 1];
	        }

	        System.out.println("Enter number of queries:");
	        int q = sc.nextInt();

	        while (q-- > 0) {
	            System.out.println("Enter l r val:");
	            int l = sc.nextInt();
	            int r = sc.nextInt();
	            int val = sc.nextInt();

	            diff[l] += val;
	            if (r + 1 < n)
	                diff[r + 1] -= val;
	        }

	        arr[0] = diff[0];
	        for (int i = 1; i < n; i++) {
	            arr[i] = arr[i - 1] + diff[i];
	        }

	        System.out.println("Updated Array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
}
