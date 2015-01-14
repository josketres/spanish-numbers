package com.josketres.spanishnumbers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;

public class DigitListTest {

    @Test
    public void should_build_a_digit_list() {

        assertThat(boxed(new DigitList(1).digits),
                arrayContaining('0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1'));
    }

    @Test
    public void should_build_a_digit_list_max_long() {

        assertThat(boxed(new DigitList(Long.MAX_VALUE).digits),
                arrayContaining('9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '7'));
    }

    @Test
    public void should_get_ordered_periods_array() {

        // 9 223 372 036 854 775 807
        // 6  5   4   3   2   1   0
        
        assertThat(boxed(new DigitList(Long.MAX_VALUE).periods),
                arrayContaining(807L, 775L, 854L, 36L, 372L, 223L, 9L));
    }

    private Long[] boxed(long[] longs) {

        Long[] boxed = new Long[longs.length];
        for (int i = 0; i < longs.length; i++) {
            boxed[i] = Long.valueOf(longs[i]);
        }
        return boxed;
    }

    private Character[] boxed(char[] chars) {

        Character[] boxed = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            boxed[i] = Character.valueOf(chars[i]);
        }
        return boxed;
    }
}