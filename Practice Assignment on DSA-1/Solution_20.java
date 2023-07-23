import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution_20{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
  String range1 = "([01]?[0-9][0-9]?";
  String range2 = "|2[0-4][0-9]";
  String range3 = "|25[0-5])";
  String A = range1+range2+range3; // 0 - 255
  final String pattern = A + '.' + A + '.' + A + '.' + A;
}
