public class nonstaticmethod {
    public void display() {
        System.out.println("This is a non-static method.");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        nonstaticmethod obj = new nonstaticmethod();
        obj.display();

        obj.greet("User");

        int sum = obj.add(5, 7);
        System.out.println("Sum: " + sum);
    }
}