public class MyInt {
    int value;
public void increment() {
    this.value++;
}

public static void main(String[] args) {
    MyInt value = new MyInt();
    value.value = 0;
    value.increment();
    System.out.println(value.value);
}
}
