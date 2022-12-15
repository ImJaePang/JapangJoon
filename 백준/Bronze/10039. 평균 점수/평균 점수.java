import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int jum = 0;
        int sum = 0;
        int avg = 0;
        
        for (int i =0; i < 5; i++){
            jum = scan.nextInt();
            if (jum < 40) {
                jum = 40;
            }
            sum += jum;
        }
        
        avg = sum / 5;
        System.out.println(avg);
        
    }
}