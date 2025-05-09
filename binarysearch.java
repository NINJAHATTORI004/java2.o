public class BinarySearch {
    public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) { // Corrected base case
            return -1;
        }
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (target > nums[mid]) {
            return binarySearch(nums, mid + 1, high, target);
        } else {
            return binarySearch(nums, low, mid - 1, target);
        }
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 9, 12, 16, 17};
        int target = 6;
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
}