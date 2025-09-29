public class CheckDriver {
    public static boolean checkDriver(boolean under18, float displacementVolume, License license) throws Exception {
        if (displacementVolume < 50 || displacementVolume > 2458) {
            throw new Exception("Inappropriate input");
        }
        if (!under18) {
            if ((displacementVolume <= 125 && (license == License.A || license == License.A1))
                    || (displacementVolume > 125 && license == License.A)) {
                return true;
            }
        }
        return false;
    }
}