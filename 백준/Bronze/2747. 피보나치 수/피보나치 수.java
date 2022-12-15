import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws Exception{
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int N = Integer.parseInt(br.readLine());        
        int a = 0;
        int b = 1;
        int c = 1;
        
        if (N == 1) {
        	System.out.print(b);
        } else if (N ==2) {
        	System.out.println(c);        	        	
        } else  {
        	for (int i = 3 ; i <= N+1 ; i++) {
        		c = a + b;
        		a = b;
        		b = c;
        	}
        	System.out.print(c);
        }

    }
}