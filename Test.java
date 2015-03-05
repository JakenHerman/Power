import java.util.Scanner;

public class Test {

    public static int power1(int x, int n){
        //Returns the value of x raised to the nth power.
	    //Preconditions: n >= 0
	    //Postcondition: The computer value is returned.

	    if(n == 0)
        {
	        return 1;
        }
        
        else
        {
            int pow = 1;
            
            for(int i = 0; i < n; i++)
            {
                pow *= x;
            }
        
            return pow;
            
        }
        
    }




    public static void main(String[] args){

        
    }

}
