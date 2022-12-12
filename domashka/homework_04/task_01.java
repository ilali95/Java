import java.util.Arrays;

public class task_01 {
	public static void main(String[] args) {
		int[] arr = { 7, 3, 9, 9, 3, 5, 2, 1, 4 };
		System.out.println("Было");
		System.out.println(Arrays.toString(arr));

		int low = 0;
		int high = arr.length - 1;

		quickSort(arr, low, high);
		System.out.println("Стало");
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] array, int low, int high) {
		if (array.length == 0)
			return;
		int mid = low + (high - low) / 2;
		int opora = array[mid];

		int i = low, j = high;
		while (i <= j) {
			while (array[i] < opora) {
				i++;
			}

			while (array[j] > opora) {
				j--;
			}

			if (i <= j) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		
	}

}
