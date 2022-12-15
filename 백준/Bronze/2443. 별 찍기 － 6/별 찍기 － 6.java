import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int total = num * 2 - 1;
        
        for (int i = 1 ; i <= num ; i++){
            int blank = i - 1;
            
            if (blank != 0){
                for (int j = 1; j <= blank; j++){
                    System.out.print(" ")    ;
                }    
            }
            
            for (int j = 1; j <= total - 2 * blank; j++ ){
                System.out.print("*");
            }
            
            if (i != num){
                System.out.println();
            }
        }
    }
}