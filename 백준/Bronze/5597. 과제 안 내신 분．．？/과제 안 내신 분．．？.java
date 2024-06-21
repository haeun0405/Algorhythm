import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
        int[] array = new int[30];
        
        for(int i=0; i<28; i++) {
        	int n = Integer.parseInt(br.readLine());
        	array[n-1] = 1;
        }
        
        for(int j=0; j< array.length; j++) {
        	if(array[j] != 1)
        		System.out.println(j+1);
        }

        br.close();
  
    }
}