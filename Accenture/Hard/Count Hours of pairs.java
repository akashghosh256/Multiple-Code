an array of minutes are given we have to count the no of pairs that form a whole hour on summation

https://www.youtube.com/watch?v=ppNhEYqPSoM   q2

import java.io.*;
import java.util.*;

public class Main {
    public int countPairs(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
            int hour = (arr[i]/60) +1;
            int target =  hour * 60;
            int rem = target - arr[i];
            System.out.println("traget: "+target);
            if(map.containsKey(rem) && map.get(rem) > 0){
                ans++;
                map.put(rem,0);
            }
            else map.put(arr[i],1);
        }
        return ans;
       
    }

    public static void main(String[] args) {
        Main sol = new Main();
        
        int[] arr1 = {10,90,30};
        int[] arr2 = {2, 58, 58,2, 60, 60};
        
        System.out.println("Ans: "+sol.countPairs(arr1));  // Output: 2
       System.out.println(sol.countPairs(arr2));  // Output: 3
    }
}
