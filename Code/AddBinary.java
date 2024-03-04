class Solution {
    public String addBinary(String a, String b) {
        StringBuilder BinaryAdd = new StringBuilder();
       int i =a.length()- 1;
       int j = b.length()-1;
       int carry = 0 ;
       while(i>=0 || j>=0){
           int sum=  carry ;
           if(i>=0) {
               sum += a.charAt(i--) -'0';//converting string to number
           }
           if(j>=0){
               sum += b.charAt(j--) - '0';
           }
           carry=sum>1 ? 1 :0;
           BinaryAdd.append(sum % 2);//storing the remainder in  the BinaryAdd as remainder  
       }
       if(carry != 0)BinaryAdd.append(carry);
       return BinaryAdd.reverse().toString(); 
    }
}