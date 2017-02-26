/**
@author Pranay Sampat
*/

/** Question

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int i =0,start=0,length=0;
    HashSet<Character> hashSet = new HashSet<>();
    while(i < s.length()){
        char ch = s.charAt(i);
        if(!hashSet.contains(ch)){
            hashSet.add(ch);
        }
        else{
            length = Math.max(length, hashSet.size());
            
            while(start<i && ch != s.charAt(start)){
                hashSet.remove(s.charAt(start));
                start ++;
            }
            start ++;
        }
        i++;
    }
    return Math.max(length,hashSet.size());
      
}
}