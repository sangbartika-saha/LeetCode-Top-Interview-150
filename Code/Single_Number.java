class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);//frequency array concept
        int ans=-1;
        int n=nums.length;
        for(int i=0;i<n;i=i+2){
            if(i==(n-1)){
                ans=nums[i];
            }
            else if(nums[i]!=nums[i+1]){
                ans=nums[i];
                break;
            }
        }
        return ans;
    }
}