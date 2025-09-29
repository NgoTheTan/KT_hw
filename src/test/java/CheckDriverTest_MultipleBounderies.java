import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheckDriverTest_MultipleBoundaries {
    // Group 1: under18 = true, displacementVolume = 50
    @Test
    public void testCase01() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 50f, License.NONE));
    }

    @Test
    public void testCase02() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 50f, License.A1));
    }

    @Test
    public void testCase03() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 50f, License.A));
    }

    // Group 2: under18 = true, displacementVolume = 50.1
    @Test
    public void testCase04() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 50.1f, License.NONE));
    }

    @Test
    public void testCase05() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 50.1f, License.A));
    }

    @Test
    public void testCase06() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 50.1f, License.A));
    }

    // Group 3: under18 = true, displacementVolume = 1254
    @Test
    public void testCase07() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 1254f, License.NONE));
    }

    @Test
    public void testCase08() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 1254f, License.A1));
    }

    @Test
    public void testCase09() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 1254f, License.A));
    }

    // Group 4: under18 = true, displacementVolume = 2457.9
    @Test
    public void testCase10() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 2457.9f, License.NONE));
    }

    @Test
    public void testCase11() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 2457.9f, License.A1));
    }

    @Test
    public void testCase12() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 2457.9f, License.A));
    }

    // Group 5: under18 = true, displacementVolume = 2458
    @Test
    public void testCase13() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 2458f, License.NONE));
    }

    @Test
    public void testCase14() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 2458f, License.A1));
    }

    @Test
    public void testCase15() throws Exception {
        assertFalse(CheckDriver.checkDriver(true, 2458f, License.A));
    }

    // Group 6: under18 = false, displacementVolume = 50
    @Test
    public void testCase16() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 50f, License.NONE));
    }

    @Test
    public void testCase17() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 50f, License.A1));
    }

    @Test
    public void testCase18() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 50f, License.A));
    }

    // Group 7: under18 = false, displacementVolume = 50.1
    @Test
    public void testCase19() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 50.1f, License.NONE));
    }

    @Test
    public void testCase20() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 50.1f, License.A1));
    }

    @Test
    public void testCase21() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 50.1f, License.A));
    }

    // Group 8: under18 = false, displacementVolume = 1254
    @Test
    public void testCase22() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 1254f, License.NONE));
    }

    @Test
    public void testCase23() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 1254f, License.A1));
    }

    @Test
    public void testCase24() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 1254f, License.A));
    }

    // Group 9: under18 = false, displacementVolume = 2457.9
    @Test
    public void testCase25() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 2457.9f, License.NONE));
    }

    @Test
    public void testCase26() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 2457.9f, License.A1));
    }

    @Test
    public void testCase27() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 2457.9f, License.A));
    }

    // Group 10: under18 = false, displacementVolume = 2458
    @Test
    public void testCase28() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 2458f, License.NONE));
    }

    @Test
    public void testCase29() throws Exception {
        assertFalse(CheckDriver.checkDriver(false, 2458f, License.A1));
    }

    @Test
    public void testCase30() throws Exception {
        assertTrue(CheckDriver.checkDriver(false, 2458f, License.A));
    }
}