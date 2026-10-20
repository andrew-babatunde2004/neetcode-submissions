class Solution {
    public int lengthOfLongestSubstring(String s) {
    int l = 0;
    int r = 0;
    int maxSub = 0;
    Set<Character> dup = new HashSet<>();

    while(r < s.length()){
        
    while(dup.contains(s.charAt(r)) ){
    dup.remove(s.charAt(l));
    l++;
    }

    dup.add(s.charAt(r));
    maxSub = Math.max(maxSub, r - l + 1);

    r++;

     }   
    return maxSub;
    }
}
