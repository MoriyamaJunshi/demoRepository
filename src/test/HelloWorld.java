package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld
{
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
        int x = Integer.parseInt( br.readLine() );
        System.out.println("0=午前、1=午後、2=夜間");
        int y = Integer.parseInt( br.readLine() );
        if(x == 1 || x == 4) {
        	System.out.println("診療可能です。");
        }else if(x == 2 || x == 5) {
        	if(y == 0 ) {
        		System.out.println("休診時間です。");
        	}else {
        		System.out.println("診療可能です。");
        	}
        }else if(x == 3 ) {
        	if(y == 2 ) {
        		System.out.println("休診時間です。");
        	}else {
        		System.out.println("診療可能です。");
        	}
        }else {
        	if(y == 0 ) {
        		System.out.println("診療可能です。");
        	}else {
        		System.out.println("休診時間です。");
        	}
        }
    }
}
