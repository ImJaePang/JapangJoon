import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int row = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        int a = 0;
        int b = 0;                
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        
        for (int i = 0; i < row ; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            
            bw.write(String.valueOf(a+b));
            if (i != row-1) {
            	bw.write("\n");                        	
            }
        }        
        bw.flush();
        bw.close();            
    }
}