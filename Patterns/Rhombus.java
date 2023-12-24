/**
 * Input : 6
 * Output : 
     ******
    ******
   ******
  ******
 ******

Another Way
     ******
    ******
   ******
  ******
 ******
******
 */

public class Rhombus
{
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
	public static void main(String[] args) {
	
	    int x = sc.nextInt();
	    
	    for(int i = 1 ; i < x ; i++){
	        for(int j = x - i ; j > 0 ; j--) System.out.print(" ");;
	        for(int j = 1 ; j <= x ; j++) System.out.print("*");
	        System.out.println();
	    }
	    
	    System.out.println();
	    System.out.println("Another Way");
	    
	    for(int i = 1 ; i <= x ; i++){
	        for(int j = 1 , n = 1  ; j <= (x - i + x) ; j++ ){
	            if(j <= (x - i)) System.out.print(" ");
	            else if(n <= x){
	                System.out.print("*");
	                n++;
	            }
	            
	        }
	        System.out.println();
	    }
	}
}