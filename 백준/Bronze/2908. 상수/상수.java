import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int a= changeNum(Integer.parseInt(st.nextToken()));        
        int b= changeNum(Integer.parseInt(st.nextToken()));                               
        
        if (a > b) {
            System.out.print(a);
        } else {
            System.out.print(b);
        }
    }
    
    public static int changeNum(int num){
        int c = num % 10;
        int b = num % 100 - c;
        int a = num / 100;
        
        int d = c*100 + b + a;
        
        return d;        
    }
}