238. Product of Array Except Self 
    


    class Solution {
        public int[] productExceptSelf(int[] nums) {
    // prefix postfix
    int n = nums.length;
    int ans[] = new int [n];
    int prefix = 1, suffix = 1;
    Arrays.fill(ans,1);
    
    // prefix
    for(int i=0; i<n; i++){
    ans[i] = prefix;
    prefix *= nums[i];
    }
    
    // postfix
    for(int i=n-1; i>=0; i--){
        ans[i] *= suffix;
        suffix *= nums[i];
    }
    return ans;
            
            
        }
    }


    class Solution {
        public int[] productExceptSelf(int[] nums) {
    // prefix postfix
    int n = nums.length;
    int ans[] = new int [n];
    int prefix = 1, suffix = 1;
    Arrays.fill(ans,1);
    
    // prefix
    for(int i=0; i<n; i++){
    ans[i] = prefix;
    prefix *= nums[i];
    }
    
    // postfix
    for(int i=n-1; i>=0; i--){
        ans[i] *= suffix;
        suffix *= nums[i];
    }
    return ans;
            
            
        }
    }