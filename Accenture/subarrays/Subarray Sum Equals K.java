// brute force 
https://www.youtube.com/watch?v=-SWrz90jCUM

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                sum = 0;
                    for(int a=i; a<=j; a++){
                     sum +=nums[a];
                    }
                if(sum == k) count++;
            }
        }
return count;
        
    }
}

// map better
class Solution {
    public int subarraySum(int[] nums, int k) {

int n = nums.length;
Map<Integer, Integer> map = new HashMap<>();

map.put(0,1);
int ans = 0;

int cumSum = 0;
for(int i=0; i<n; i++){
    cumSum += nums[i];
    int rem = cumSum - k;
    if(map.containsKey(rem)){
        // no of time its found in history
        ans += map.get(rem);
    }
    map.put(cumSum, map.getOrDefault(cumSum, 0)+1);
}
return ans;

        
    }
}