package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;

public class MyApp {

	private static List<Integer> fibo = new ArrayList<Integer>();

	public static void main(String[] args) {
		fibo.add(1);
		fibo.add(1);
		System.out.println(fiboRecursive(7));
	}


	public static List<Integer> fiboRecursive(long n) {
		if (n == 0 || n == 1) {
			return fibo;
		} else {
			fiboRecursive(n - 1) + fiboRecursive(n - 2);
			return ();
		}

	}

}
