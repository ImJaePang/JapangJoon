import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        char[] abc = br.readLine().toCharArray();
        
        for (int i = 0 ; i < abc.length ; i++){
            System.out.print(abc[i]);
            if ((i+1) % 10 == 0){
                System.out.println();
            }
        }
        
    }
}