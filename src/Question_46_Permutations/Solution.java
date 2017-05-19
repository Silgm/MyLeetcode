package Question_46_Permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<List<Integer>> all_permute = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int sum = 1;
        for (int i = 2; i < nums.length + 1; i++) {
            sum *= i;
        }
        while (sum > 0) {
            List<Integer> integerList = new ArrayList<>();
            for (int value : nums) {
                integerList.add(value);
            }
            nums = nextPermute(nums);
            sum--;
            all_permute.add(integerList);
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
                for (; value > nums[swap_position]; swap_position--) ;
                swap(nums, swap_position, position-1);
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
