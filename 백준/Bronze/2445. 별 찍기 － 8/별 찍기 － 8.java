import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int total = num * 2;
        
        for (int i = 1; i <= num - 1; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= total - 2 * i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= total; i++){
            System.out.print("*");
        }
        System.out.println();
        
        for (int i = 1; i <= num - 1; i++){
            for (int j = 1; j <= num - i; j++){
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= num - i; j++){
                System.out.print("*");
            }
            if (i != num -1){
            System.out.println();    
            }
        }
       
    }
}