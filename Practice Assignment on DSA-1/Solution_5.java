import java.io.*;
import java.util.*;

public class Solution_5 {
    
    public static boolean isSolvable(int leap, int[] game, int i) {
        if(i >=game.length)
            return true;
        if(i<0 || game[i]==1)
            return false;
        game[i] = 1;
        return isSolvable(leap, game, i+leap) || isSolvable(leap, game, i+1) || isSolvable(leap, game, i-1); 
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while(q-- >0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            int[] game = new int[n];
            for(int i=0; i<n; i++) {
                game[i]=scan.nextInt();
            }
            if(isSolvable(leap, game, 0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}