package Week3;

import java.util.Scanner;

public class SearchRotatedArray {
	 public static int search(int arr[], int n, int key) {
	        int low = 0, high = n - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (arr[mid] == key)
	                return mid;

	            if (arr[low] <= arr[mid]) {
	                if (key >= arr[low] && key < arr[mid])
	                    high = mid - 1;
	                else
	                    low = mid + 1;
	            } else {
	                if (key > arr[mid] && key <= arr[high])
	                    low = mid + 1;
	                else
	                    high = mid - 1;
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size:");
	        int n = sc.nextInt();

	        int arr[] = new int[n];

	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        System.out.println("Enter element to search:");
	        int key = sc.nextInt();

	        int result = search(arr, n, key);

	        if (result == -1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Element found at index " + result);
	    }
	}
