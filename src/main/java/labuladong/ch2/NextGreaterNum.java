package labuladong.ch2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/8
 */

public class NextGreaterNum {

    public static void main(String[] args) {
        int[] nums = {2, 1, 2, 4, 3};
        int[] res = new NextGreaterNum().nextGreaterElements(nums);
        System.out.println(Arrays.toString(res));

        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] ans = new NextGreaterNum().nextWarmerDays(temperatures);
        System.out.println(Arrays.toString(ans));

        int[] numbers = {2, 1, 2, 4, 3};
        int[] result = new NextGreaterNum().nextGreaterNumber(numbers);
        System.out.println(Arrays.toString(result));
    }

    int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    int[] nextGreaterNumber(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % n]) {
                stack.pop();
            }
            res[i % n] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i % n]);
        }
        return res;
    }

    int[] nextWarmerDays(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek() - i;
            stack.push(i);
        }

        return res;
    }

}
