public class update {
    public static void main(String[] args){
        int[] arr={10,20,30, 40, 50};
        arr[2]=100;
        System.out.println("Updated array:");
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at index "+i+" is "+arr[i]);
        }
    }
}
