package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld{
    public static void main( String[] args ) throws IOException{
	        BufferedReader br = new BufferedReader(
	                                new InputStreamReader( System.in ) );

	        int sum = 0;
	       
	        for( ; ; ) {
	        	 int x = Integer.parseInt( br.readLine() );
	        	 
	        	 if(x == 0) {
	        		 break;
	        	 }
	        	 
	        	sum += x;
	        }
	        	System.out.println(sum);
	}
}

