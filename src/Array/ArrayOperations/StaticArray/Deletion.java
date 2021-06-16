package Array.ArrayOperations.StaticArray;


public class Deletion {
    public int deleteElement(int arr[],int n,int element ){
        int i=0;
        for(i=0;i<n;i++){
            if(arr[i]==element){
                break;
          
            }
        }
            if(i==n)
                return n;
            for(int j=i;j<n-1;j++){
                arr[j]=arr[j+1];
            }
        return n-1;
    }
    
}
