import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));        
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger num0 = new BigInteger(st.nextToken());
        BigInteger num1 = new BigInteger(st.nextToken());
        System.out.println(num0.divide(num1));
        System.out.println(num0.subtract(num0.divide(num1).multiply(num1)));        
        br.close();
    }
}