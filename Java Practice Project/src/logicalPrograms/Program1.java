package logicalPrograms;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		System.out.println("entr a number to chek even/odd");
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
			 if (num%2==0) {
				 System.out.println("number is even = "+ num);
			 }else {
				 System.out.println("num is odd");
			 }
		}
	}

}
