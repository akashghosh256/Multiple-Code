
https://www.youtube.com/watch?v=9ZyLjjk536U


class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int longLen = 0;
        Map<Integer,Integer> map = new HashMap<>();

        int sum = 0;

        for(int i=0; i<n; i++){

            if(nums[i] == 1) sum += 1;
            else sum -=1;

            if(sum == 0){
                if(longLen < i+1)
                longLen = i+1;
            }
            else if(map.containsKey(sum)){
                int val = i - map.get(sum);
                if(longLen < val) longLen = val;
            }
            else map.put(sum,i);
        
        }

        return longLen;







    }
}