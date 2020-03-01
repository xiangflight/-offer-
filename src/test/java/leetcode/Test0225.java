package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/1
 */

class Test0225 {



    @Test
    @DisplayName("225 Implement Stack Using Queues")
    void testStack() {
        Solution0225 solution = new Solution0225();
        Solution0225.MyStack stack = solution.new MyStack();
        stack.push(2);
        stack.push(3);
        assertEquals(stack.pop(), 3);
        assertEquals(stack.pop(), 2);
        assertTrue(stack.empty());

    }

}