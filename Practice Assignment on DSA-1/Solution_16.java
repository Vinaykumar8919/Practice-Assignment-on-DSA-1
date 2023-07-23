import java.io.*;
import java.util.*;

public class Solution_16 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev = "";
        for(int i=A.length()-1; i>-1; i--) {
            rev = rev+A.charAt(i);
        
        }
        if(rev.equals(A)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}



