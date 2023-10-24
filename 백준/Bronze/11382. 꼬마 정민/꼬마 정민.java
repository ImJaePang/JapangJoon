import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main{
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();
        String[] numberArray = numbers.split(" ");
        BigInteger num0 = new BigInteger(numberArray[0]);
        BigInteger num1 = new BigInteger(numberArray[1]);
        BigInteger num2 = new BigInteger(numberArray[2]);
        
        System.out.println(num0.add(num1).add(num2));
    }
}