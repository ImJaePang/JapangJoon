import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int x = scan.nextInt();
    
        for (int i = 1; i <= N ; i++){
            int a = scan.nextInt();
            if (a < x) {
                System.out.print(a + " ");
            }
        }
        
    }
    
     
}