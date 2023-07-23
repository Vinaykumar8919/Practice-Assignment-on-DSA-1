import java.math.BigInteger;
import java.util.Scanner;

public class Solution_23{
    public static final Scanner scn = new Scanner(System.in);
    public static void main(String[] args)  {
        BigInteger bigInteger;
        String input = scn.nextLine(); // Read input as a string
        bigInteger = new BigInteger(input);

       boolean sol = bigInteger.isProbablePrime(1);

        if (sol)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
}