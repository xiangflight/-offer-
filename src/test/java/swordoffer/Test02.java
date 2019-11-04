package swordoffer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/4
 */

class Test02 {

    @Test
    @DisplayName("test dcl singleton")
    void testDclSingleton() {
        DclSingleton first = DclSingleton.getInstance();
        DclSingleton second = DclSingleton.getInstance();
        assertEquals(first, second);
    }

    @Test
    @DisplayName("test static singleton")
    void testStaticSingleton() {
        StaticSingleton third = StaticSingleton.getInstance();
        StaticSingleton fourth = StaticSingleton.getInstance();
        assertEquals(third, fourth);
    }
}
