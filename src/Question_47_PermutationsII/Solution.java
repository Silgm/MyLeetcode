package Question_47_PermutationsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> all_permute = new ArrayList<>();
        int[] copy = nums.clone();
        while (true) {
            List<Integer> integerList = new ArrayList<>();
            for (int value : nums) {
                integerList.add(value);
            }
            all_permute.add(integerList);
            nums = nextPermute(nums);
            int i = 0;
            for (; i < nums.length && nums[i] == copy[i]; i++) ;
            if (i == nums.length) {
                break;
            }

        }
        return all_permute;
    }

    private int[] nextPermute(int[] nums) {
        int[] next = new int[nums.length];
        int position = nums.length - 1;
        for (; position > 0; position--) {
            if (nums[position - 1] < nums[position]) {
                int value = nums[position - 1];
                int swap_position = nums.length - 1;
                for (; value >= nums[swap_position]; swap_position--) ;
                swap(nums, swap_position, position - 1);
                Arrays.sort(nums, position, nums.length);
                break;
            }
        }
        if (position == 0) {
            Arrays.sort(nums);
        }
        position = 0;
        for (int x : nums) {
            next[position++] = x;
        }
            return next;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
