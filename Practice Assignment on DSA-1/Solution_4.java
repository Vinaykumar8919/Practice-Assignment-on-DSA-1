import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();
        for(int i = 0; i < line; i++)
        {
                ArrayList<Integer> innerList = new ArrayList();
                int elem = sc.nextInt();
                for(int j = 0; j < elem; j++)
                {
                        Integer num = sc.nextInt();
                        innerList.add(num);
                }
                outerList.add(innerList);
        }

        int output_num = sc.nextInt();

        for(int i = 0; i < output_num; i ++ )
        {
                int ln_num=sc.nextInt();
                int el_num=sc.nextInt();
                if (ln_num - 1 < outerList.size()) 
                {
                        ArrayList<Integer> ln = outerList.get(ln_num - 1);
                        if (el_num - 1 < ln.size()) 
                        {
                                Integer vl = ln.get(el_num - 1);
                                System.out.println(vl);
                        }
                        else
                        {
                                System.out.println("ERROR!");
                        }
                }
                else
                {
                        System.out.println("ERROR!");
                }
        }
    }
}
