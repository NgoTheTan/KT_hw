import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheckDriverTest_DecisionTable {
    @Test
    public void testCase01() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(true, 35f, License.NONE));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase02() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 110f, License.NONE));
    }

    @Test
    public void testCase03() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 149.7f, License.NONE));
    }

    @Test
    public void testCase04() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(true, 2500f, License.NONE));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase05() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(true, 25f, License.A1));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase06_Under18True_Volume501_A() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 124.8f, License.A1));
    }

    @Test
    public void testCase07() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 155f, License.A1));
    }

    @Test
    public void testCase08() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(true, 2600f, License.A1));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase09() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(true, 45f, License.A));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase10() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 109.5f, License.A));
    }

    @Test
    public void testCase11() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 286f, License.A));
    }

    @Test
    public void testCase12() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(true, 2550f, License.A));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase13() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(false, 44.3f, License.NONE));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase14() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 109.2f, License.NONE));
    }

    @Test
    public void testCase15() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 373.2f, License.NONE));
    }

    @Test
    public void testCase16() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(false, 2525.3f, License.NONE));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase17() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(false, 48.2f, License.A1));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase18() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 124.9f, License.A1));
    }

    @Test
    public void testCase19() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 803f, License.A1));
    }

    @Test
    public void testCase20() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(false, 2636.9f, License.A1));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase21() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(false, 36.9f, License.A));
        assertEquals("Inappropriate input", exception.getMessage());
    }

    @Test
    public void testCase22() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 124f, License.A));
    }

    @Test
    public void testCase23() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 1043f, License.A));
    }

    @Test
    public void testCase24() {
        Exception exception = assertThrows(Exception.class, () -> CheckDriver.checkDriver(false, 2536.5f, License.A));
        assertEquals("Inappropriate input", exception.getMessage());
    }
}