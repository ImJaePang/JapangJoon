import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main{
    static BufferedReader br;
    static StringTokenizer st;
        
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int num0 = Integer.parseInt(st.nextToken());
        int num1 = Integer.parseInt(st.nextToken());
        if (num0 > num1) System.out.println(">");
        if (num0 < num1) System.out.println("<");
        if (num0 == num1) System.out.println("==");
    }
}