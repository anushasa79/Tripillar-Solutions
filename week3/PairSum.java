package Week3;

import java.util.Scanner;

public class PairSum {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size of array:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter array elements:");
	        for(int i = 0; i < n; i++){
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Enter target value:");
	        int target = sc.nextInt();

	        System.out.println("Pairs with given sum:");

	        for(int i = 0; i < n; i++){
	            for(int j = i + 1; j < n; j++){
	                if(arr[i] + arr[j] == target){
	                    System.out.println(arr[i] + " " + arr[j]);
	                }
	            }
	        }
	    }
	}

