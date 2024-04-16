package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld
{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int winCount = 0;
        int loseCount = 0;
        
        try {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + "回目の対戦結果を入力 (0: 負け, 1: 勝ち): ");
            int score = 	Integer.parseInt(br.readLine());

            if (score == 0) {
                loseCount++;
            } else if (score == 1) {
                winCount++;
            } else {
                System.out.println("不正な入力です。0 または 1 を入力してください。");
                i--; // 入力ミスした場合はカウントしない
            }
        }

        System.out.println("対戦結果:");
        System.out.println("勝ち：" + winCount + "回");
        System.out.println("負け：" + loseCount + "回");
        
        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

