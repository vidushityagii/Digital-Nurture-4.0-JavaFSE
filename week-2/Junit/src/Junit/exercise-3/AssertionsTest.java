package Junit.Exercise3;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        System.out.println("Checking assertEquals...");
        assertEquals(5, 2 + 3);

        System.out.println("Checking assertTrue...");
        assertTrue(5 > 3);

        System.out.println("Checking assertFalse...");
        assertFalse(5 < 3);

        System.out.println("Checking assertNull...");
        assertNull(null);

        System.out.println("Checking assertNotNull...");
        assertNotNull(new Object());

        System.out.println("All assertions passed.");
    }
}

