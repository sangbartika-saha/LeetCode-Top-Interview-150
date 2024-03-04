class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int n=nums.length;
        for(int i=0;i<32;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(((nums[j]>>i)& 1)==1){
                    sum++;
                    sum=sum%3;//Performing the operation sum = (sum + 1) % 3 ensures that sum cycles 
                    //between 0, 1, and 2, representing the number of occurrences of the current bit position modulo 3. 
                    //This operation is crucial for handling the scenario where each element appears 
                    //three times except for one.
                }
            }
            if(sum!= 0){
                ans |=sum<<i;
            }
        }
        return ans;
    }
}