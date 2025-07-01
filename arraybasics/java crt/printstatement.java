import java.util.Scanner;

public class printstatement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hihi:");
        String input=sc.nextLine();
        if(input.equals("1")){
            System.out.println("hi");

        }else if(input.equals("2")){
            System.out.println("haha");

        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
        


    }
}
