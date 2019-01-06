//453. Minimum Moves to Equal Array Elements

public class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        
        for(int val:nums){
            min = Math.min(val, min);
        }

        for(int number:nums){
            result += number - min;
        }
        return result;
    }
}
