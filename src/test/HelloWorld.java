package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld
{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        
            int x = Integer.parseInt( br.readLine() );
            for(int i = 0; i < x;  i++) {
            	System.out.print( i % 10 );
            }

    }
}

