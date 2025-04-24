public class FindMissingNumber {
    // Optimized method to find the missing number
    public int findMissingNumber(int[] arr, int size) {
        // Calculate the expected sum of numbers from 0 to size
        int expectedSum = size * (size + 1) / 2;

        // Calculate the actual sum of the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        FindMissingNumber finder = new FindMissingNumber();
        int[] arr = {0, 1, 2, 4, 5}; // Example input
        int size = 5; // The range is from 0 to 5
        int missingNumber = finder.findMissingNumber(arr, size);
        System.out.println("The missing number is: " + missingNumber);
    }
}