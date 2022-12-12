// Написать программу вычисления n-ого треугольного числа. url


import java.util.Scanner;

public class task_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число: ");
		int num = scan.nextInt();
		System.out.println(triangularNum(num));
	}
	public static int triangularNum(int n) {
		if(n==1)
			return 1;
		else
			return( n + triangularNum(n-1) );
	}
}
