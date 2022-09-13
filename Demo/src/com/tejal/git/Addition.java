package com.tejal.git;

import java.util.Scanner;

public class Addition 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first value");
		int x=sc.nextInt();
		
		System.out.println("Enter second value");
		int y=sc.nextInt();
		
		int sum=x+y;
		System.out.println("Addition of x+y"+sum);
		
		sc.close();
	}
}
