import java.io.*;
import java.util.*;

public class Solution_6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        List<Integer> list = new ArrayList<>();
        
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            list.add(x);
        }
        
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scan.next();
            
            if(query.equals("Insert")) {
                int x = scan.nextInt();
                int  y = scan.nextInt();
                list.add(x, y);
            } else {
                int x = scan.nextInt();
                list.remove(x);
            }
        }
        for (int ele : list) {
            System.out.print(ele + " ");
        }
    }
}
