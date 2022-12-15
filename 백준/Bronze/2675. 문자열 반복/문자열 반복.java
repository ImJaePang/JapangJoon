import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());
        int bae = 0;
        
        for (int i = 0 ; i < row; i++){
            st = new StringTokenizer(br.readLine(), " ");
            bae = Integer.parseInt(st.nextToken());
            char[] abc = st.nextToken().toCharArray();
            for (int j = 0 ; j < abc.length ; j++){
                for (int k = 0 ; k < bae ; k++){
                    System.out.print(abc[j]);
                }
            }
            if (i != row -1){
                System.out.println();
            }
        }
    }
}