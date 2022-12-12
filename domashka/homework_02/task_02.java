import java.util.Arrays;

// Реализовать алгоритм сортировки вставками

public class task_02 {
	public static void main(String[] args) {
		int [] arr = {10, 2, 4, 5, 32, 56, 32, 2, 1};
		for (int left = 0; left < arr.length; left++){
			int num = arr[left];
			int i = left - 1;
			for (; i >= 0; i--){
				if (num < arr[i]){
					arr[i + 1] = arr[i];
				}
				else{
					break;
				}
			}
			arr[i + 1] = num;
		}
		System.out.println(Arrays.toString(arr));
	}

}
