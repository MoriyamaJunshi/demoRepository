package test;

public class HelloWorld {
	public static void main(String[] args) {
		int x = 1;
		for(int n = 1; n <= 8; n ++ ) {
			x *= 2;
			System.out.println("2の" + n + "乗は" + x);
		}
	}
}
