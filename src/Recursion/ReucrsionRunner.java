package Recursion;
import Recursion.TowerOfHanoi.TOH;

public class ReucrsionRunner {

	public static void main(String[] args) {
                        TOH t=new TOH();                    
                        t.toh(3,'A','B','C');
                        
                        System.out.println(t.movementOfDisc(4));
	}

}
