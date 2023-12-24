// Input : 5
// Output :
// 1 2 3 4 5 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

public class UpperRightTriangle
{
    static java.util.Scanner sc = new java.util.Scanner(System.in);
    
	public static void main(String[] args) {
	
	    int x = sc.nextInt();
	    
	    for(int i = x ; i > 0 ; i--){
	        for(int j = 1; j <= i ; j++){
	           System.out.print(j  + " ");
	        }
	        System.out.println();
	    }
	}
}