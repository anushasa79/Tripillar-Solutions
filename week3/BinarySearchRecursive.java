package Week3;
import java.util.Scanner;

	public class BinarySearchRecursive {

	    static int binarySearch(int arr[], int low, int high, int key){
	        if(low<=high){
	            int mid=(low+high)/2;

	            if(arr[mid]==key)
	                return mid;
	            else if(key<arr[mid])
	                return binarySearch(arr, low, mid-1, key);
	            else
	                return binarySearch(arr, mid+1, high, key);
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);

	        System.out.println("Enter size of array:");
	        int n=sc.nextInt();

	        int arr[]=new int[n];

	        System.out.println("Enter sorted array elements:");
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }

	        System.out.println("Enter element to search:");
	        int key=sc.nextInt();

	        int result=binarySearch(arr,0,n-1,key);

	        if(result==-1)
	            System.out.println("Element not found");
	        else
	            System.out.println("Element found at position "+result);
	    }
	}

