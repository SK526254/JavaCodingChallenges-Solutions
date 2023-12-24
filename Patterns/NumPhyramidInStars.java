/**
 Input :6
 Output : 

**********1**********
*********2*2*********
********3*3*3********
*******4*4*4*4*******
******5*5*5*5*5******
*****6*6*6*6*6*6*****

 */
import java.util.Scanner;
public class NumPhyramidInStars
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int r = sc.nextInt();
	    
	    for(int i = 1 ; i <= r ; i++){
	        int stars = (i != 1)? (r * 2 - i - 1) : (r - i) * 2;
	        for(int j = 1 ; j <= stars ; j++) System.out.print("*");
	        for(int j = 1 ; j <= i  ; j++){    
    	        System.out.print(i);
    	        if(j != i) System.out.print("*");
	        } 
	        for(int j = 1 ; j <= stars ; j++) System.out.print("*");
	        System.out.println();
	        
	    }
	}
}