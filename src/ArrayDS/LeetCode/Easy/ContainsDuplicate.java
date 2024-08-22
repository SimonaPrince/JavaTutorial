package ArrayDS.LeetCode.Easy;

import java.util.HashMap;

public class ContainsDuplicate {

    //Solution took almost 36 ms which is not a good
    public static boolean checkDupe(int[] nums){
        if(nums.length == 0){
            return true;
        }
        HashMap<Integer,Integer> cmap=new HashMap<>();
        for (int num : nums) {
            if (cmap.containsKey(num)) {
                cmap.put(num, cmap.get(num) + 1);
            } else {
                cmap.put(num, 1);
            }
        }
        long res= cmap.entrySet().stream().filter(s -> s.getValue() > 1).count();
        return res >= 1;
    }
}
