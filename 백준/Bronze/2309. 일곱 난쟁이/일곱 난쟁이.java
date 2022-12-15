import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int[] arr = new int[9];
        int sum = 0;
        
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());    
            sum += arr[i];
        }
        
        quickSort(0, arr.length - 1, arr);
        
        boolean ok = false;

        
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (sum - (arr[i] + arr[j]) == 100){
                    ok = showArr(i, j, arr);
                    break;
                }
            }
            if (ok){break;}
        }      
    }
    
    public static boolean showArr(int i, int j, int[] arr){        
        int s = 0;
        
        for (int k = 0; k < arr.length; k++){            
            if (k != i && k != j){
                System.out.print(arr[k]);
                s++;
                
                if (s < 7) {
                	System.out.println();
                }
            }            
        }
        
        return true;
    }
    
    public static void quickSort(int start, int end, int[] arr){
        
        if (start < end){
            int p = partition(start, end, arr);
            
            quickSort(start, p-1, arr);
            quickSort(p+1, end, arr);            
        }        
    }
    
    public static int partition(int start, int end, int[] arr){
        
        int pivot = arr[start];
        int i = end + 1;
        
        for (int j = end ; j > start ; j--){
            if (arr[j] >= pivot){
                i--;
                swap(j, i, arr);
            }            
        }
        swap(start, i - 1, arr);
        
        return i - 1;        
    }
    
    public static void swap(int i, int j, int[] arr){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;                        
    }
    
}