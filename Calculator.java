package javaCodes;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter First Number : ");
			double fnum = sc.nextDouble();
			System.out.println("Enter Operation : \n[+ : Addition]" + "\n[- : Substraction]\n[* : Multiplication]"
					+ "\n[/ : Division]\n[root : Square Root]\n[^ : To The Power]");
			String ch = sc.next();
			switch (ch) {
			case "+":
				System.out.println("Enter Second Number :");
				double lnum = sc.nextDouble();
				System.out.println("= " + plus(fnum, lnum));
				break;
			case "-":
				System.out.println("Enter Second Number :");
				lnum = sc.nextDouble();
				System.out.println("= " + minus(fnum, lnum));
				break;
			case "*":
				System.out.println("Enter Second Number :");
				lnum = sc.nextDouble();
				System.out.println("= " + multiply(fnum, lnum));
				break;
			case "/":
				System.out.println("Enter Second Number :");
				lnum = sc.nextDouble();
				System.out.println("= " + divide(fnum, lnum));
				break;
			case "root":
				System.out.println("= " + root(fnum));
				break;
			case "^":
				System.out.println("Enter Exponent :");
				lnum = sc.nextDouble();
				System.out.println("= " + toThePower(fnum, lnum));
				break;
			default:
				System.out.println("Invalid choice...");
			}
			System.out.println("[0->Exit],[Any Other Key->Continue]");
			ch=sc.next();
			switch (ch) {
			case "0": System.exit(0);
			default:
				continue;
			}
		}
	}

	private static double plus(double a, double b) {
		return a + b;
	}

	private static double minus(double a, double b) {
		return a - b;
	}

	private static double multiply(double a, double b) {
		return a * b;
	}

	private static double divide(double a, double b) {
		return a / b;
	}

	private static double root(double a) {
		return Math.sqrt(a);
	}

	private static double toThePower(double a, double b) {
		return Math.pow(a, b);
	}

}
