import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        
        int num = 0;
        int jum = 0;
        boolean nonum = false;
        
        for (int i = 0 ; i < row ; i++){
            nonum = true;            
            num = scan.nextInt();
            
            if (num != 1) {
            	for (int j = 2; j < num ; j++){
            		if (num == 1){
            			nonum = false;
            			break;
            		} else if (num % j == 0){
            			nonum = false;
            			break;
            		}
            	}            	
            } else {
            	nonum = false;
            }
            
            
            if (nonum){
                jum++;
            }
        }
        System.out.print(jum);
    }
}