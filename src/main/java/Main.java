import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean under18 = input.nextBoolean();
        float displacementVolume = input.nextFloat();
        String licenseInput = input.next().toUpperCase();
        try {
            License license = License.valueOf(licenseInput);
            if (CheckDriver.checkDriver(under18, displacementVolume, license)) {
                System.out.println("Qualified.");
            } else {
                System.out.println("Unqualified");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
