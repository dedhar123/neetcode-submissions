class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet <>();
       int left = 0;
       int maxLength = 0;
       //remove duplicates
       for(int right=0 ; right < s.length() ; right++)
       {
         while(set.contains(s.charAt(right)))
         {
           set.remove(s.charAt(left)) ;
           left++;  
         }
         //Add current charecter
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
       }
       return maxLength;
       
}
}
