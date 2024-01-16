class Solution {
    public boolean isHappy(int n) {
        Set<Integer> array = new HashSet<>();

        while(n != 1 && !array.contains(n)){
            array.add(n);
             int sum=0;
             while(n>0){
             int digit = n % 10;
             sum+= digit * digit;
             n=n/10;
             }
             n=sum;

        }
        return n==1; 
    }
}
