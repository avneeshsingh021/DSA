package Recursion.TowerOfHanoi;

public class TOH {

//Tower Of Hanoi Algorithm    
   public void toh(int n,char A, char B, char C){
        if(n==1){
            System.out.println("Move 1 from "+ A +" to "+ C);
            return;
        }
        toh(n-1,A,B,C);
        System.out.println("Move "+n+ " from "+A +" to "+C);
        toh(n-1,B,A,C);
    }
 //Calculating number of movements in moving the total disc
   
   public int movementOfDisc(int n){
       int sum=(int ) Math.pow(2, n)-1;  //Type Casting As thr Math.pow() fun is by default double 
       return sum;
   }

}
