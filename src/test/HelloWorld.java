package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int sum = 0;

        try {
            for (int i = 0; i < 10; i++) {
                int value = Integer.parseInt(br.readLine());
                sum += value;
            }
            System.out.println("平均は" + (sum / 10));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

