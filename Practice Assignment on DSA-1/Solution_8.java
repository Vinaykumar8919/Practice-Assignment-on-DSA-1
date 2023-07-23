import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution_8 {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> Set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            Set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(Set.size());
        } 
//Write your code here

    }
}
// https://www.hackerrank.com/challenges/java-hashset/problem?isFullScreen=true