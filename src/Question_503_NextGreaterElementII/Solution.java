package Question_503_NextGreaterElementII;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] next = new int[nums.length];
        Arrays.fill(next, -1);
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < nums.length * 2; i++) {
            int value = nums[i % nums.length];
            while (!stack.isEmpty() && nums[stack.peek()] < value) {
                next[stack.pop()] = value;
            }
            if (i < nums.length) {
                stack.push(i);
            }
        }
        return next;
    }
}
