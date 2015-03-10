import java.util.Scanner;

public class Test {

public static int power1(int x, int n)
{
    int total = 1; //initialize total to 1 for n = 0
    for(int i = 0; i < n; i++)
    {
        total = (x * total);
    }
    return total; // total remains 1 if n = 0
}




    public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter X: ");
		int x = scan.nextInt();
		System.out.println("Enter N: ");
		int n = scan.nextInt();

		System.out.println(power1(x, n));

    }

}
