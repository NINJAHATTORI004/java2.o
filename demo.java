public class demo {
    public static void main(String[] args) {
        int num[] = { 5, 7, 9, 11, 13, 101 };
        int target = 101;
        int result = linearsearch(num, target);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    public static int linearsearch(int arr[], int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
