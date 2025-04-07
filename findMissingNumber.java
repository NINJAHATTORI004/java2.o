public class findMissingNumber {
    int findMissingNumber(int[]arr, int size){
        int i,j,found=0;
        for(i=0;i<size;i++){
            found=0;
            for(j=0;j<size;j++){
                if(arr[j]==i){
                    found=1;
                     break;

        
                }
            }
            if (found==0){
                return i;
            }
                return i;
        }
        return Integer.MAX_VALUE;
    }
    
}
