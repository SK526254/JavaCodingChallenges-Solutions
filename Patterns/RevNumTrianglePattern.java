/**
 * Input : 5
 * Output : 

1 2 3 4 5 
 2 3 4 5 
  3 4 5 
   4 5 
    5 
 */

import java.util.Scanner;
public class RevNumTrianglePattern
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    for(int i = n ; i > 0 ; i--){
	        for(int j = 1 ; j <= (n - i) ; j++){
	            System.out.print(" ");
	        }
	        for(int j = (n - i + 1) ; j <= (n) ; j++){
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }
	}
}