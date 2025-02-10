package stack;

public class stackusingarray {
    private static final int CAPACITY = 1000;
    private int[] data;
    private int top = -1;

    public stackusingarray() {
        this(CAPACITY);
    }

    public stackusingarray(int capacity) {
        data = new int[capacity];
        System.err.println("hello ji");
    }

    // Additional methods for stack operations can be added here

    public static void main(String[] args) {
        stackusingarray stack = new stackusingarray();
        // Add test code here to use the stack
    }
}
