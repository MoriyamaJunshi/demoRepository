package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld
{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
 
            int sum = 0;

            while(sum <= 100) {
            	int num = Integer.parseInt( br.readLine() );
            	sum += num;
            }
            System.out.println("合計は" + sum );

    }
}

