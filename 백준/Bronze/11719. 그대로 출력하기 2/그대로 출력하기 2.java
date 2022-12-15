import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            String msg = scan.nextLine();
            System.out.println(msg);
        }
    }
}