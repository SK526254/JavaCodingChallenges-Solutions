// Input : 7
// Output : 
//       1 
//      1 2 
//     1 2 3 
//    1 2 3 4 
//   1 2 3 4 5 
//  1 2 3 4 5 6 
// 1 2 3 4 5 6 7 

// Next Pattern
//       1 
//      2 2 
//     3 3 3 
//    4 4 4 4 
//   5 5 5 5 5 
//  6 6 6 6 6 6 
// 7 7 7 7 7 7 7 


import java.util.Scanner;
public class NumberTriangle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =1 ; i <= n ; i++){
		    for(int j = 1 ; j <= (n - i) ; j++){
		        System.out.print(" ");
		    }
		    for(int j = 1 ; j <= i ; j++){
		        System.out.print(j + " ");
		    }
		    System.out.println();
		}
		
		System.out.println();
		System.out.println("Next Pattern");
		
		for(int i =1 ; i <= n ; i++){
		    for(int j = 1 ; j <= (n - i) ; j++){
		        System.out.print(" ");
		    }
		    for(int j = 1 ; j <= i ; j++){
		        System.out.print(i + " ");
		    }
		    System.out.println();
		}
	}
}