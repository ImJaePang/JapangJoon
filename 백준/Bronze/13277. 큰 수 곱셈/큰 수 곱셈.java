import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();
        StringTokenizer st = new StringTokenizer(numbers);
        BigInteger num0 = new BigInteger(st.nextToken());
        BigInteger num1 = new BigInteger(st.nextToken());
        
        System.out.println(num0.multiply(num1));
    }
}