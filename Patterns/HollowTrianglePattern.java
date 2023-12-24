/**
 Input :  5
 Output : 
    * 
   * * 
  *   * 
 *     * 
* * * * * 
 */
import java.util.Scanner;
public class HollowTrianglePattern
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
		System.out.println("\nFirst Way\n");
	    for(int i = 1 ; i <= n ; i++){
	        for(int j = 1 ; j <= (n - i) ; j++){
	            System.out.print(" ");
	        }
	        for(int j = 1; j <= i ; j++){
	            if(j == 1 || j == i || i == n) System.out.print("* ");
	            else System.out.print("  ");
	        }
	        System.out.println();
	    }
		System.out.println("\nSecond Way\n");
		 for(int i = 1 ; i <= n ; i++){
            for(int j = n - i ; j > 0 ; j--) System.out.print(" ");
            for(int j = 1 ; j <= i ; j++){
                if(j == 1 || i == 1 || (i == n) && j % 2 == 1) System.out.print("*");
                else System.out.print(" ");
            }
            
            for(int j = i - 1 ; j > 0 ; j--){
                if(j == 1 || i == 1 || (i == n) && (j % 2== 1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("\nThird Way\n");
        
        for(int i = 1 ; i <= n ; i++){
            for(int j = n - i; j > 0 ; j--) System.out.print(" ");
            
            for( int j = 1 ; j < (i * 2) ; j++){
                System.out.print((j == 1 || j == (i * 2 - 1) || i == n && j % 2 == 1) ? "*" : " ");
            }
            System.out.println();
        }
	}
}