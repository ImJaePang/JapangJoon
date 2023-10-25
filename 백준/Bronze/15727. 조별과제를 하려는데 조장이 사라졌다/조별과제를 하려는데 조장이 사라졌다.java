import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        if (num % 5 == 0){
            System.out.println(num / 5);
        } else {
            System.out.println(num / 5 + 1);
        }
            
            
        
    }
}