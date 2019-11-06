package swordoffer;

import dsa.ListNode;
import org.junit.jupiter.api.*;
import utils.ArrayUtil;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/6
 */
class Test06 {

    private final PrintFromTailToHead printFromTailToHead = new PrintFromTailToHead();

    private ListNode head;

    @BeforeEach
    void preTest() {
        int[] arr = {2, 3, 4};
        head = ArrayUtil.toList(arr);
    }

    @Test
    @DisplayName("Print ListNode from Tail to Head Recursively")
    void testPrintFromTailToHead() {
        assertEquals(Arrays.asList(4, 3, 2), printFromTailToHead.printFromTailToHead(head));
    }

    @Test
    @DisplayName("Print ListNode from Tail to Head Using Stack")
    void testPrintFromTailToHeadUsingStack() {
        assertEquals(Arrays.asList(4, 3, 2), printFromTailToHead.printFromTailToHeadUsingStack(head));
    }

}
