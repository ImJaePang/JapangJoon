import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char[] abc = br.readLine().toString().toUpperCase().toCharArray();
        int[] nums = new int[26];
        
        int num = 0;
        int max = 0;
        int target = 0;
  
        for (char alpha : abc) {
            nums[((int) alpha) - 65] += 1;
        }
        
        for (int number : nums) {
        	if (number > max) {
        		max = number;
        	}
        }
        
        for (int i = 0 ; i < nums.length ; i++) {
        	if (nums[i] == max) {
        		num++;
        		target = i;
        	}
        	if (num >= 2) {
        		break;
        	}
        }
        
        if (num >= 2) {
        	System.out.print("?");
        } else {
        	System.out.print((char)(target+65));
        }
        
    }
}