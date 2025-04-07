public class FindUniqueNumbers {
    public static void find(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 5, 6, 8}; // Example input
        int n = arr.length;
        find(arr, n);
    }
}