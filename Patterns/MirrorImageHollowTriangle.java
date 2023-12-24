/**
 Input : 5
 Output : 
 
* * * * * 
 *     *  
  *   *   
   * *    
    *     
   * *    
  *   *   
 *     *  
* * * * * 
 */

import java.util.Scanner;
class MirrorImageHollowTriangle
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		
		if(r <= 0){
		    System.out.println("Invalid Input");
		    return;
		}
		
		
		int n = 2 * r -1 ;
		
		for(int i = 1 ; i <= n ; i++){
		    for(int j = 1 ; j <= n ; j++){
		        if( (j == i || j == n - i + 1 )|| ((i == 1 || i == n) && j % 2 == 1)) System.out.print("*");
		        else System.out.print(" ");
		        
		    }
		    System.out.println(" ");
		}
		
	}
}