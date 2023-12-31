import java.io.*;
import java.util.*;

public class Solution_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arr[i][j] = arrItem;
            }
        }

        bufferedReader.close();
        int maxsum = Integer.MIN_VALUE;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int sum2 = arr[i + 1][j + 1];
                int sum3 = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                int hourglassSum = sum1 + sum2 + sum3;
                
                if (hourglassSum > maxsum) {
                    maxsum = hourglassSum;
                }
            }
        }
        
        System.out.println(maxsum);
    }
}
