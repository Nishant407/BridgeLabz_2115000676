import java.util.HashSet;
import java.util.Set;

public class level3Q7 {

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otpArray) {
            otpSet.add(otp);
        }
        return otpSet.size() == otpArray.length;
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        boolean unique = areOTPsUnique(otpArray);
        if (unique) {
            System.out.println("\nAll OTPs are unique.");
        } else {
            System.out.println("\nSome OTPs are not unique.");
        }
    }
}
