package stack;

public class stack {
    private static final int CAPACITY = 1000;
    private int[] data; // Remove the space between int and []
    private int top = -1;

    public stack() {
        this(CAPACITY); // Proper indentation
    }

    public stack(int capacity) {
        data = new int[capacity]; // Proper indentation
    }

    // Additional methods for stack operations can be added here
}