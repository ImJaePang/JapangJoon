import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num % 5 == 0) {
            System.out.println(num / 5);
        } else {
            System.out.println(num / 5 +1);            
        }        
    }
}