import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dan = scan.nextInt();
        
        for (int i = 0; i <= dan-1; i++){
            for (int j = 1; j <= dan-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}