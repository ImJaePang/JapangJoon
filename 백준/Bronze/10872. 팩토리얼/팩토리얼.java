import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
     
        int num = Integer.parseInt(br.readLine());
        int tot = 1;
        
        if (num == 0) {
            System.out.print(1);
        } else {
            for (int i = 0; i < num ; i++){
                tot *= (i+1);
            }
            System.out.print(tot);
        }    
    }
}