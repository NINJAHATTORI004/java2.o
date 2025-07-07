public class StringMethodsDemo {
    public static void main(String[] args){
        String str1 = "Hello";
        System.out.println(str1.length()); // 5

        String str2 = "World";
        System.out.println(str2.charAt(2)); // 'r'

        String str3 = "Hello World";
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        String a = "apple";
        String b = "banana";
        System.out.println(a.compareTo(b)); // negative value

        String s3 = " Hello World ";
        System.out.println(s3.trim()); // "Hello World"

        String str5 = "banana";
        System.out.println(str5.replace('a', 'o')); // "bonono"
        System.out.println(str5.replaceAll("na", "123")); // "ba123123"

        // You can add more String method demos here if needed
    }
}