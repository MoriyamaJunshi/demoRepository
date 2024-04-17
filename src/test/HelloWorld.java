package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld
{
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
 
        int strike = 0;
        int ball = 0;

        while( strike < 3 && ball < 4 )
        {
            System.out.print( "ストライク=1 or ボール=2 orファウル=3" );

            int judge = Integer.parseInt( br.readLine() );

            if( judge == 1 )
                strike++;
            else if( judge == 2 )
                ball++;
            else if (judge ==3 && strike <2)
            	strike++;
            	
        }

        System.out.println( ball + "ボール," + strike + "ストライク" );

    }
}

