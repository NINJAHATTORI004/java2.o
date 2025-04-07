public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false; // Negative numbers and 0 are not powers of 2
        }
        while (n > 1) {
            if (n % 2 != 0) {
                return false; // If n is not divisible by 2, it's not a power of 2
            }
            n /= 2; // Divide n by 2
        }
        return true; // If we reach 1, it's a power of 2
    }

    public static void main(String[] args) {
        int num = 16; // Example input
        if (isPowerOfTwo(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is not a power of 2.");
        }
    }
}

