/**
 Input : 5
 Output : 
* * * * * 
* * * * 
* * * 
* * 
* 
* * 
* * * 
* * * * 
* * * * * 
 */

import java.util.Scanner;
public class KPattern
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    for(int i = n ; i > 0 ; i--){
	        for(int j = i ; j > 0 ; j--){
	            System.out.print("* " );
	            
	        }
	        System.out.println();
	    }
	    for(int i = 2 ; i <= n ; i++){
	        for(int j = 1 ; j <= i ; j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
