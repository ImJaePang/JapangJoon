import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int a = 0;
        int b = 0;        
        
        for (int i = 0 ; i < row ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.print(a+b);
            if (i != row -1) {
            	System.out.println();            	
            }
        }
    }
}