import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        int a = 100 - num1;
        int b = 100 - num2;
        int c = 100 - a - b;
        int d = a * b;
        int q = d / 100;
        int r = d % 100;
        
        int result = (c+q) * 100 + r;
        
        System.out.println(a + " "+ b + " " + c + " " + d + " " + q + " " + r);
        System.out.print((c+q)+ " " + r);
        

        
    }
}