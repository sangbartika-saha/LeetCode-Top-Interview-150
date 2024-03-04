class Solution {
    public int[] plusOne(int[] digits) {
        for (int  i = digits.length - 1 ;i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;// incrementing 1 for all nos less than 9 
                return digits;
            }
            digits[i]=0;
        }
        int digits2[] = new int[digits.length+1];
        digits2[0]=1;
        return digits2 ;
    }
}