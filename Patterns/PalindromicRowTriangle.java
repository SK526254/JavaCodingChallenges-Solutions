/**
 * Input : 5
 * Output : 
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 

Another Way
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
 */
import java.util.Scanner;
public class PalindromicRowTriangle
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    for(int i =1 ; i <= n ; i++){
	        for(int j = 1 ; j <=(n - i) ; j++){
	            System.out.print("  ");
	        }
	        for(int j = i ; j > 0 ; j--){
	            System.out.print(j + " ");
	        }
	        for(int j = 2 ; j <= i ; j++){
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println("Another Way");
	    
	    for(int i = 1 ; i <= n ; i++){
	        for(int j = n ; j > 0 ; j--){
	            if(i >= j) System.out.print(j + " ");
	            else System.out.print("  ");
	        }
	        for(int j = 2 ; j <= i ; j++){
	            System.out.print(j + " ");
	        }
    	    System.out.println();
	    }
	}
}