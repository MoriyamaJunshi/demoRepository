package test;

public class HelloWorld {
	public static void main(String[] args) {
		int x = -1;
		if (x > 0) {
			  if (x % 2 == 0) {
			    System.out.println("xは正の偶数です");
			  } else {
			    System.out.println("xは正の奇数です");
			  }
		} else if (x < 0) {
			  if (x % 2 == 0) {
			    System.out.println("xは負の偶数です");
			  } else {
			    System.out.println("xは負の奇数です");
			  }
		}else {
			System.out.println("xは正の偶数です");
		}
	}
}
