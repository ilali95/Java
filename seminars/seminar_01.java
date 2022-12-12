
// 1.	+Реализовать функцию возведения числа а в степень b. a, b ∈ Z.
// Сводя количество выполняемых действий к минимуму. 
// Пример 1: а = 3, b = 2, ответ: 9 
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1
// Пример 4: а = 0, b = 0, ответ: не определено
// Пример 5
// входные данные находятся в файле input.txt в виде
// b 3
// a 10
// Результат нужно сохранить в файле output.txt
// 1000

// public class seminar_01 {
// 	public static void main(String[] args) {
// 		Scanner scanner = new Scanner(System.in);
// 		System.out.print("Число a: ");
// 		int a = scanner.nextInt();
// 		System.out.print("Степень b: ");
// 		int b = scanner.nextInt();

// 		public static int pow(int a; int b) {
// 			int res = 1;
// 			for (int i = 1; i < b; i++) {
// 				res = a*a ;
// 			}
// 			return res
// 		}
// 	}

// }

// 2.	+На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить а в с раз, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b 
// или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд


import java.util.Scanner;

/**
 * Innerseminar_01
 */
public class seminar_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Число a: ");
		int a = scan.nextInt();
		System.out.print("Степень b: ");
		int b = scan.nextInt();
		int c = 2;
		int d = 1;
		int r = 0;
		while (a != b) {
			if (a < b) {
				System.out.println(k2(a, c));
				int x = k2(a, c);
				if (x > b) {
					r = a + d;
				}
			}
		}
		System.out.println(r);
	}

	public static int k2(int a, int c) {
		int k;
		k = a * c;
		return k;
	}

}