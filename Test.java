import java.util.Scanner;

public class Test {
    
    
    /*
     
     =============================
        Power1 - Iterative
     =============================
     
     Calculating x^n for n >= 0
     
     */

public static int power1(int x, int n)
{
    
    //make sure n is > or = to 0
    
    if (n < 0) {
        throw new IllegalArgumentException("Illegal Power Argument");
    }
    
    //begin calculation
    
    int total = 1; //initialize total to 1 for n = 0
    for(int i = 0; i < n; i++)
    {
        total = (x * total);
    }
    return total; // total remains 1 if n = 0
}

    
    /*
     
     ==============================
        Power2 - Recursive
     ==============================
     
     if n = 0        -       x^0 = 1
     if n > 0 -  x^n = x * (x^n - 1)
     
     
     */

    public static int power2(int x, int n) {
        
        //make sure n is > or = to 0
        
        if (n < 0) {
            throw new IllegalArgumentException("Illegal Power Argument");
        }
        
        //begin calculation
        
        else if (n==0)
        {
            return 1;
        }
        
        else
        {
            double power = Math.pow(x, (n-1));
            int powInt = (int) power;
            return (x * powInt);
        }
    }
    
    /*
     
     ==============================
     Power3 - Recursive
     ==============================
     
     if n =0        -        x^0 = 1
     if n >0 & n%2 =0 - x^n=(x^n/2)^2
     if n >0 & n%2 !=0 - x(x^(n/2))^2
     
     */
    
    public static int power3(int x ,int n) {
        
        //make sure n is > or = to 0
        
        if (n < 0) {
            throw new IllegalArgumentException("Illegal Power Argument");
        }
        
        //begin calculation
        
        else if (n==0)
        {
            return 1;
        }
            
        else if (n%2 == 0)
        {
            double power = Math.pow(x, (n/2));
            int powInt = (int) power;
            
            return powInt * powInt;
        }
        
        else
        {
            return (x * power3(x, (n-1)));
        }
    }


    public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter X: ");
		int x = scan.nextInt();
		System.out.println("Enter N: ");
		int n = scan.nextInt();

		System.out.println(power1(x, n));
           System.out.println(power2(x, n));
           System.out.println(power3(x, n));

    }

}
