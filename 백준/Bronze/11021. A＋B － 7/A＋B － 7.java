import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nums = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        for (int i = 1; i < nums+1 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #");
            sb.append(i);
            sb.append(": "+ (a+b));
            if (i != nums){
              sb.append("\n");  
            } 
        }
        
        System.out.println(sb.toString());
        
    }
}