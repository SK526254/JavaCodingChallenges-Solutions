/**
 Input :  5
 Output : 
         1   
       2   2   
     3   3   3   
   4   4   4   4   
 5   5   5   5   5 
 */
import java.util.Scanner;
public class NumberPhyramid
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    int spaces = 0;
	    for(int i = 1 ; i <= n ; i++){
	        spaces = 2 * (n - i) ;
	        if(i < 10) spaces += 1;
	   
	        for(int j = 1 ; j <= spaces; j++) System.out.print(" ");
	        for(int j = 1 ; j <= i ; j++){
	            if(i < 10) System.out.print(i + "   ");
	            else System.out.print(i + "  ");
	        }
	        System.out.println();
	    }
	}
}