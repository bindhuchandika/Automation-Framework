package basics;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
	System.out.println("Enter a no");
    int num = s.nextInt();
    switch(num%2)
    {
    case 0:
    System.out.println("even");	
    break;
    case 1: 
    System.out.println("odd");
    break;
    }
    System.out.println("------------");
    if(num%2==0)
    {
    	System.out.println("even");
    }
    else
    {
    	System.out.println("odd");
    }
  }
}
