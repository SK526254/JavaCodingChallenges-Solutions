/**
Input : 5
Output : 

* * * * * * * * * * 
 * * * *   * * * * 
  * * *     * * * 
   * *       * * 
    *         * 
   * *       * * 
  * * *     * * * 
 * * * *   * * * * 
* * * * * * * * * * 

 */
import java.util.Scanner;
class FourMirroredTriangles
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		if(r <= 0){
		    System.out.print("Invalid Input");
		    return;
		}
		int i = 0 , j = 0 , c = 0;
		
		for( i = r ; i > 0 ; ){
		    c++;
		    for( j = (r - i) * c ; j > 0 ; j--) System.out.print(" ");
		    for( j = 1 ; j <= i ; j++) System.out.print("* ");
		    if(c == 2){
		        c = 0;
		        i --;
    		    System.out.println();
		    }
		}
		for( i = 2 ; i <= r ; ){
		    c++;
		    for( j = (r - i) * c ; j > 0 ; j--) System.out.print(" ");
		    for( j = 1 ; j <= i ; j++) System.out.print("* ");
		    if(c == 2){
		        c = 0;
		        i ++;
    		    System.out.println();
		    }
		    
		}
	}
}