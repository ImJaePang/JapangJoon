import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int col = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        
        for (int i = 0; i < col; i++){
            sum += Integer.parseInt(nums.substring(i, i+1));
        }
        System.out.println(sum);
    }
}