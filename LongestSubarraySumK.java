package Week3;

import java.util.*;

public class LongestSubarraySumK {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];

            if(sum == k)
                maxLen = i + 1;

            if(!map.containsKey(sum))
                map.put(sum, i);

            if(map.containsKey(sum - k))
                maxLen = Math.max(maxLen, i - map.get(sum - k));
        }

        System.out.println("Longest subarray length: " + maxLen);
    }
}

