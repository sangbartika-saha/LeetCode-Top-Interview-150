public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int sum = 0 ;
        String t= Integer.toBinaryString(n);
        for(int i =0; i<t.length();i++){
            if(t.charAt(i)== '1'){
                ++sum;
            }
        }
        return sum;
    }
}