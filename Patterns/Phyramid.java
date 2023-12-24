/**
 Input : 8
 Output : 
              01  
            02  03  
          04  05  06  
        07  08  09  10  
      11  12  13  14  15  
    16  17  18  19  20  21  
  22  23  24  25  26  27  28  
29  30  31  32  33  34  35  36  

 */
public class Phyramid
{
    static java.util.Scanner sc = new java.util.Scanner(System.in);
	public static void main(String[] args) {
	    int n = sc.nextInt() , c = 0;
	    
	    for(int i = 1 ; i <= n ; i++){
	        for(int j = 1 ; j <= n - i ; j++){
	            System.out.print("  ");
	        }
	        for(int j = 1 ; j <= i ; j++){
	            c++;
	            if(c < 10 ) System.out.print("0" + c + "  ");
	            else System.out.print(c + "  ");
	        }
	        System.out.println();
	    }
	}
}