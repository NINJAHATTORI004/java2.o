import java.util.Scanner;

public class whil2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        int i = 0;
        while(i < counter){
            if(i == 5){
                System.out.println("Five");
            } else {
                System.out.println(i);
            }
            i++;
        }
        sc.close();
    }
}