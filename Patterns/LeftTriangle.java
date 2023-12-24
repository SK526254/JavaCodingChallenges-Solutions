/**
 Input : 5
 Output : 
        1 
      2 1 
    3 2 1 
  4 3 2 1
5 4 3 2 1
 */
public class LeftTriangle
{
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
	public static void main(String[] args) {
	
	    int x = sc.nextInt();
	    
	    for(int i = 1 ; i <= x ; i++){
	        for(int j = x; j > 0 ; j--){
	           if(i >= j)System.out.print(j  + " ");
	           else System.out.print("  ");
	        }
	        System.out.println();
	    }
	}
}