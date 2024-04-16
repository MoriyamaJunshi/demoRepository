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
        System.out.println("中間試験点数を入力");
        int midExam = Integer.parseInt( br.readLine() );
        System.out.println("期末試験点数を入力");
        int finExam = Integer.parseInt( br.readLine() );
        if(midExam >= 60 && finExam >= 60) {
        	System.out.println("合格");
        }else if(midExam + finExam >= 130) {
        	System.out.println("合格");
        }else if(midExam + finExam >= 100 && (midExam>=90 || finExam>=90) ) {
        	System.out.println("合格");
        }else {
        	System.out.println("不合格");
        }
    }
}
