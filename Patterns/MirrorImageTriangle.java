/**
 Input : 6
 Output : 

1 2 3 4 5 6 
 2 3 4 5 6 
  3 4 5 6 
   4 5 6 
    5 6 
     6 
    5 6 
   4 5 6 
  3 4 5 6 
 2 3 4 5 6 
1 2 3 4 5 6

 */
import java.util.Scanner;
public class MirrorImageTriangle
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
	    for(int i = 2 ; i <= n ; i++){
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