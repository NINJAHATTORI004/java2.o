public class panvalidator {
    public static void main(String[] args) {
        String pan = "ABCDE1234F";   
        System.out.println(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]"));
    }
}