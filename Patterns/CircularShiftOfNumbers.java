/*
Input : 7
Output : 

1 2 3 4 5 6 7 
2 3 4 5 6 7 1 
3 4 5 6 7 1 2 
4 5 6 7 1 2 3 
5 6 7 1 2 3 4 
6 7 1 2 3 4 5 
7 1 2 3 4 5 6
*/
import java.util.Scanner;
public class CircularShiftOfNumbers
{
	public static void main(String[] args) {
	    Scanner sc  = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    for(int i = 1 ; i <= n ; i++){
	        for(int j = i ; j <= n ; j++) System.out.print(j +" ");
	        for(int j = 1 ; j < i ; j++) System.out.print(j +" ");
    	    System.out.println();
	    }
	}
}
