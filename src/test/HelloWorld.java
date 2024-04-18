package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld{
    public static void main( String[] args ) throws IOException{
	        BufferedReader br = new BufferedReader(
	                                new InputStreamReader( System.in ) );

	        int sum = 0;
	       int count = 0;
	        for( ; ; ) {
	        	 int x = Integer.parseInt( br.readLine() );
	        	 if(x == 0) {
	        		 break;
	        	 }
	        	sum += x;
	        	count ++;
	        }
	        	System.out.println(sum / count);
	}
}

