import java.util.Scanner;

public class Solution_17 {

    static boolean isAnagram(String a, String b) {
      if(a.length()!=b.length()) return false;

    char str_a[]=a.toLowerCase().toCharArray();
    char str_b[]=b.toLowerCase().toCharArray();

    java.util.Arrays.sort(str_a);
    java.util.Arrays.sort(str_b);

    return java.util.Arrays.equals(str_a,str_b);

}

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}