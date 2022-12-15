import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
    	
    	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	StringTokenizer st;
    	
    	int row = Integer.parseInt(br.readLine());
    	int age = 0;
    	String name;
    	HashMap<Integer, StringBuilder> list = new HashMap<>();

    	for (int i= 0 ; i <row; i++) {
    		st = new StringTokenizer(br.readLine(), " ");
    		age = Integer.parseInt(st.nextToken());
    		name = st.nextToken();
    		if(list.get(age) == null) {
    			list.put(age, new StringBuilder());
    		}
    		list.put(age, list.get(age).append(age + " "+ name + "\n"));    		    			
    	}    	    	    	
    	    	    	
    	Set<Integer> keys =list.keySet();
    	
    	for(int key : keys) {
    		System.out.print(list.get(key));
    	}   	
    }       
    
}