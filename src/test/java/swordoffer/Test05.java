package swordoffer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/11/5
 */

class Test05 {

    private final ReplaceSpaces replaceSpaces = new ReplaceSpaces();

    @Test
    @DisplayName("Replaces Spaces")
    void testReplaceSpaces() {
        String origin = "We are happy.";
        String expected = "We%20are%20happy.";
        String token = "%20";
        assertEquals(replaceSpaces.replaceSpaces(origin, token), expected);
    }

}
