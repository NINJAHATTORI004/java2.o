public class boxingunboxing {
    public static void main (String[] args){
        int a =50;
        Integer obj=a;
        int b=obj;
        System.out.println("primitive int: " + b);
        System.out.println("object: " + obj);
        System.out.println("unboxed int: " + b);
        System.out.println("Sum of a and b: " + (a + b));
        System.out.println("Sum of a and obj: " + (a + obj));
        System.out.println("Sum of obj and b: " + (obj + b));
        System.out.println("Sum of obj and obj: " + (obj + obj));
        System.out.println("Sum of a and 100: " + (a + 100));
        System.out.println("Sum of obj and 100: " + (obj + 100));

    }

}
