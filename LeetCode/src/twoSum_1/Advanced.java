package twoSum_1;

import java.util.*;

public class Advanced {
	public static int[] twoSum(int[] nums, int target) {

        int[] retNum = new int[2];
        int len = nums.length;    
        int i = 0;

        //Use HashMap
        //efficiency of this procedure is decided by the complexity of "get" in hashmap
        //it may be O(nlogn) for O(logn) "get"
        //or O(n) for O(1) "get"
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int tmp = 0;
        for(i = 0; i < len; i++){
        	//use "remains" to be keys
            tmp = target-nums[i];
            if(map.containsKey(tmp)){
                retNum[0] = map.get(tmp);
                retNum[1] = i;
                return retNum;
            }else{
                map.put(nums[i], i);
            }
        }
        return retNum;
    }
}
