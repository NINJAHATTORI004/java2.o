public class arrayiteration {
    public static void main(String[] args) {
        int[] arr={10,20,30};
        System.out.println("for loop:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");

        }
        System.out.println("\n for-example loop:");
        for (int val:arr){
            System.out.print(val+" ");
            
        }
      
        }
    }
