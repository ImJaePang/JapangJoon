import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num = Integer.parseInt(br.readLine());
        
        if (num == 1){
            System.out.print("*");
        } else {
            
            int row = 2 * num;
        
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
        
            for (int i = 0; i < num ; i++){
                if (i % 2 == 0){
                    sb1.append("*");
                    if (i != num-1) {
                    	sb2.append(" ");                    	
                    }
                } else {
                	if (i != num-1) {
                		sb1.append(" ");                		
                	}
                    sb2.append("*");
                }
            }        
            
            String odd = sb1.toString();
            String even = sb2.toString();
        
            for (int i = 0 ; i < row ; i++){
                if (i % 2 == 0){
                    System.out.print(odd);
                } else {
                    System.out.print(even);
                }
                if (i != row-1){
                    System.out.println();
                }
            }
            
        } 
        
    }
}