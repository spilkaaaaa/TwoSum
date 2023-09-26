import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        Map<Integer, Integer> idByValue = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = target - nums[i];
            if (idByValue.containsKey(curr)) {
                return new int[]{idByValue.get(curr), i};
            }
            idByValue.put(nums[i], i);
        }

        return null;
    }
}
