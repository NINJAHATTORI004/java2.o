public class insertion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] newArr = new int[arr.length + 1];
        int insertPos = 2;
        int insertVal = 25;

        // Copy elements before the insertion position
        for (int i = 0; i < insertPos; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new value
        newArr[insertPos] = insertVal;

        // Copy elements after the insertion position
        for (int i = insertPos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print the updated array
        System.out.println("After Insertion:");
        for (int val : newArr) {
            System.out.print(val + " ");
        }
    }
}