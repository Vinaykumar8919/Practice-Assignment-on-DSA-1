import java.util.Scanner;

public class Solution_15 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = "";
        String temp;
        
        for(int i=0; i<s.length()-k+1; i++) {
            temp = s.substring(i,k+i);
            if(temp.compareTo(largest)>0) {
                largest=temp;
            }
            if(temp.compareTo(smallest)<0) {
                smallest = temp;
                
            }
        }
        
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}