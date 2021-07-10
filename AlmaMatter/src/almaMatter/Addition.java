package almaMatter;

import java.util.Scanner;

public class Addition {
public static void main(String[] args) {
	int i,j,sum;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter any two numbers :");
	i=scan.nextInt();
	j=scan.nextInt();
	sum=i+j;
	System.out.println("The addition of two numbers is :"+sum);
}
}
