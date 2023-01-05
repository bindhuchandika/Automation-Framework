package basics;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter age");
    int age = s.nextInt();
    String res = (age>=18) ? "eligible" : "not eligible";
	System.out.println(res);
	}

}
