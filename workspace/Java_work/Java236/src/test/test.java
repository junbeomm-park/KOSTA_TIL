package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class test {
	
	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.addLast(12);
		stack.addLast(59);
		stack.addLast(7);
		
		while(!stack.isEmpty()) {
			int num = stack.removeLast();
			System.out.println(num);
		}
	}
}
