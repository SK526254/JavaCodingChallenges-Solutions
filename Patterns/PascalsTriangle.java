/**
 * PASCAL'S TRIANGLE
 * Input : 5
 * Output : 
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */
import java.util.Scanner;
class PascalsTriangle
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc  =new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n == 0) System.out.println("Invalid Input");
		else if(n < 0) System.out.println("Given Input is Negative");
		else{
		  
		    for(int i  = 1 ; i <= n ; i++){
		        for(int j = 1 ; j <= (n - i) ; j++){
		            System.out.print(" ");
		        }
		        int p = 1 ;
		        for(int j = 1 ; j <= i ; j++) {
		            System.out.print(p + " ");
		            p = (p * (i - j)) / j;
		            
		        }
		     
		        System.out.println();
		    }
		}
	}
}