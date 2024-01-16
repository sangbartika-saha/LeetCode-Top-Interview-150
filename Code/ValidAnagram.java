class Solution {
    public boolean isAnagram(String s, String t) {
      char[] chs=s.toCharArray();
      char[] cht=t.toCharArray();
      Arrays.sort(chs);
      Arrays.sort(cht);

      
      return Arrays.equals(chs,cht);
    }
}