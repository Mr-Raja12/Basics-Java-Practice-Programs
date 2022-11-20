package com.bl.practiceProblems;
public class DomenstrateStatic {
	
	static int i=10;
	static void Display()
	{
		System.out.println("Static method");
	}
	static
	{
		System.out.println("Static block");
	}
    public static void main(String[] args) {
		System.out.println("Static Variable " +i);
		Display();
	}
}
