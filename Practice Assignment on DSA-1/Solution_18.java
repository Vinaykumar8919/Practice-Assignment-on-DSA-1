import java.io.*;
import java.util.*;

public class Solution_18{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        String[] words=s.split("[ !,?._'@]+");
    if (s.isEmpty())
            System.out.println(0);
        else 
            System.out.println(words.length);
            for (String token: words)
                System.out.println(token);
        scan.close();
    }
}

    