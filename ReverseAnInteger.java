/**
* @author Pranay Sampat
*/

/**
*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

Note:
The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.

*/
public class Solution {
    public int reverse(int x) {
       
        boolean flag = false;
        if( x < 0){
            x = 0 - x;
            flag = true;
        }
        long reverse = 0;
        
        while( x != 0){
            reverse = reverse * 10 + x%10;
            x = x/10;
        }
      if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE)
        return 0;
        else{
            if(flag){
                
                return (int)( 0 - reverse);
            }else{
                return (int) reverse;
            }
        }
}
}