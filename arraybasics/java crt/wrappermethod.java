public class wrappermethod {
    public static void main(String[] args){
        Integer x=100;
        System.out.println("Binary:"+Integer.toBinaryString(x));
        System.out.println("Octal:"+Integer.toOctalString(x));
        System.out.println("Hexadecimal:"+Integer.toHexString(x));
        System.out.println("Compare: "+Integer.compare(100, 200));
    }

}
