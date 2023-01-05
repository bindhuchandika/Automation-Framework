package basics;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a no");
	int num = s.nextInt();
	
	String res;
	res = (num%2==0)?"even":"odd";
	System.out.println(res);
	System.out.println("------------");
	
	int res1;
	res1 = (num%2==0)? 0:1;
	System.out.println(res1);
	System.out.println("------------");
	
	boolean res2;
	res2 = (num%2==0)? true:false;
	System.out.println(res2);
	}

}
