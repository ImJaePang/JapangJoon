import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num0 = Integer.parseInt(st.nextToken());
        int num1 = Integer.parseInt(st.nextToken());
        System.out.println((num0+num1)*(num0-num1));
    }
}