
package Array.ArrayOperations.StaticArray;

public class Insertion {
    
    public int insertElement(int arr[],int n, int element,int position,int capacity){
        if(capacity==n)
            return n;
        int index=position -1;// because array starts with - so position 2 means index 1
        
              //Here array elemts will be lost  so to avoid it we run code backwards as we assume the array is not full
            //for(int j=index; j<n-1; j++){ 
            //  arr[j]=a[j+1];
            
            for(int j=n-1;j>=index;j--){
                arr[j+1]=arr[j];
        }
            arr[index]=element;
       
            return n+1;
    }
    
}
