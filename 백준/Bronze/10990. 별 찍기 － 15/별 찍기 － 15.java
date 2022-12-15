import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        for (int i = 1; i <= num ; i++){
        	
            for (int j = 1; j <= num - i ; j++){
                System.out.print(" ");
            }
            
            int end = 2*i-1;
            
            for (int j = 1; j <= end; j++){
                if(j == 1 || j == 2*i -1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }   
            }
            if (i != num){
                System.out.println();
            }
        }
    }
}