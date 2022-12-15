import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int i = 0;
        while(st.hasMoreTokens()){
            st.nextToken();
            i++;            
        }
        System.out.println(i);
    }
}