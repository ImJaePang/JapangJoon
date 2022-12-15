import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        for (int i = 1; i <= dan; i++){
            for (int j = dan - i; j >= 1; j--){
                System.out.print(" ");
            }
            
            for (int k = 1 ; k <= i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}