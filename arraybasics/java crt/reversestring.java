public class reversestring {
    public static void main (String[] args){
        String str="Hemanth";
        String rev= new StringBuilder(str).reverse().toString();
        System.out.println("Original String: " + rev);
    }

}
