import java.util.ArrayList;
import java.util.List;

// Описать структуру такую, что:
// Есть хранилище, можно добавить извлечь.
// 0 0 0 0 0 0 0 0 0 0
// void myadd (int item)
// int myremove (void)
// myadd(2)
// 2 0 0 0 0 0 0 0 0 0
// myadd(12)
// 2 12 0 0 0 0 0 0 0 0
// myadd(1)
// 2 12 1 0 0 0 0 0 0 0
// el = myremove()
// 12 1 0 0 0 0 0 0 0 0
// el = myremove()
// 1 0 0 0 0 0 0 0 0 0
// myadd(14)
// 1 14 0 0 0 0 0 0 0 0

/**
 * seminar_03
 */
public class seminar_03 {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		int my = 2;
		myadd(arr, my);
		my = 12;
		myadd(arr, my);
		my = 1;
		myadd(arr, my);
		myremove(arr);
		myremove(arr);
		my = 14;
		myadd(arr, my);
		System.out.println(arr);
	}
	public static void myadd(List<Integer>Mylist, int my){
		Mylist.add(my);
		System.out.println(Mylist);
	}
	public static void myremove(List<Integer>Mylist){
		Mylist.remove(0);
	}
	
}