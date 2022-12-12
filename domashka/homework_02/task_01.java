// Написать программу, показывающую последовательность действий для игры “Ханойская башня”

public class task_01 {
	public static void main(String[] args) {
		int count = 3;
		hano('A', 'B', 'C', count);
	}

	public static void hano(char a, char b, char c, int count) {
		if (count == 1) {
			System.out.println(String.format("от %s на %s", a, b));
		} else {
			hano(a, c, b, count - 1);
			System.out.println(String.format("от %s на %s", a, b));
			hano(a, b, c, count - 1);
		}
	}
}