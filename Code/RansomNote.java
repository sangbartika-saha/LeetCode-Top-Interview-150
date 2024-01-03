class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     int[] count=new int[1000];
     for(char ch : magazine.toCharArray()){
         ++count[ch];
     }
     for(char ch : ransomNote.toCharArray()){
     if(--count[ch] < 0){
         return false;
     }
     }
     return true;
    }
}