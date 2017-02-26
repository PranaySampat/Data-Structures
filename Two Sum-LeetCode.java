/**
@author Pranay Sampat
*/

/** Question

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

//solution
/** the idea here is to store complementary numbers so for first 
* we put 7 in hashMap at index 0
* Now since we have got 7 at 0 and at 1 so index will be 0 and i = 1 which the answer to Solution
* Time Complexity - O(n)
*/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
      for(int i=0;i<nums.length;i++){
          if(hashMap.containsKey(nums[i])){
              int index = hashMap.get(nums[i]);
              return new int[]{index,i};
          }else{
              hashMap.put(target-nums[i],i);
          }
      }
      return new int[]{-1,-1};
}
}