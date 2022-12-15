import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int star = scan.nextInt();
        
        for (int i = 1; i <= star ; i++){
            
            int num = 2 * i - 1;
            
            for (int j = 1; j <= star-i ; j++){
                System.out.print(" ");
            }
            
            for (int j = 1; j <= num; j++){
                System.out.print("*");
            }
            
            if (i !=star) {
            	System.out.println();            
            }
        }

    }
}
