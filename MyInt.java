public class MyInt {
    int value;
}
class MyInt {
    int value;

    public void increment() {
        this.value++;
    }
}
    value.increment();
public static void main(String[] args) {
    MyInt value = new MyInt();
    value.value = 0;
    increment(value);
    System.out.println(value.value);
}