import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int jum = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        
        for (int i =1 ; i <= num ; i++){
            if (i <100){
                jum++;
            } else {
                c = i % 10;
                b = i % 100 / 10;
                a = i / 100;
                if (a-b == b-c){
                    jum++;
                }
            }
        }
        System.out.print(jum);   
    
    }
}