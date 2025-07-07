public class StringMethodsDemo {
    public static void main(String[] args){
        String str1 = "Hello";
        System.out.println(str1.length()); 

        String str2 = "World";
        System.out.println(str2.charAt(2)); 

        String str3 = "Hello World";
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equalsIgnoreCase(s2)); 

        String a = "apple";
        String b = "banana";
        System.out.println(a.compareTo(b)); 

        String s3 = " Hello World ";
        System.out.println(s3.trim()); 

        String str5 = "banana";
        System.out.println(str5.replace('a', 'o')); 
        System.out.println(str5.replaceAll("na", "123")); 

      
    }
}