package test;

public class HelloWorld {
	public static void main(String[] args) {
		int x = 3;
		int y = 2;
		if(x > y) {
			System.out.println("xはyより大きい");
		}else if(x < y) {
			System.out.println("xはyより小さい");
		}else {
			System.out.println("xとyは等しい");
		}
	}
}