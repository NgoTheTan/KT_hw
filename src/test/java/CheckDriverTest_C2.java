import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheckDriverTest_C2 {
    @Test
    public void testCase01() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(true, 3600f, License.NONE));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase02() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 50f, License.NONE));
    }

    @Test
    public void testCase03() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 155f, License.A1));
    }

    @Test
    public void testCase04() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 999f, License.A));
    }
}