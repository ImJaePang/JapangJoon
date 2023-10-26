import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger num0 = new BigInteger(st.nextToken());
        BigInteger num1 = new BigInteger(st.nextToken());
        System.out.println(num0.add(num1).multiply(num0.subtract(num1)));
    }
}