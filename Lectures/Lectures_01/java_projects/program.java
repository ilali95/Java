// public class program {
// 	public static void main(String[] args) {
// 		String s = "2";
		
// 		System.out.println(s);
// 	}
	
// }

// class Program
// {
//   public static void main(String[] args) {
//     short age = 10;
//     int salary = 123456;
//     System.out.println(age);        //10
//     System.out.println(salary);     //123456
//   }
// }

// class Program
// {
//   public static void main(String[] args) {
//       float e = 2.7f;
//       double pi = 3.1415;
//       System.out.println(e);        // 2.7
//       System.out.println(pi);       // 3.1415
//   }
// }

// class Program
// {
//   public static void main(String[] args) {
//       char ch = '1';
//       System.out.println(Character.isDigit(ch));  // true
//       ch = 'a';
//       System.out.println(Character.isDigit(ch));  // false
//   }
// }

// public class Program {
//     public static void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1);  // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2);  // true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3);  // false
//     }
// }

// public class program {
// 	public static void main(String[] args) {
// 		boolean a = 123 <=234;
		
// 		System.out.println(a);
// 	}
// }

// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);  // 123
//         var d = 123.456;
//         System.out.println(d);  // 123.456
//         System.out.println(getType(a));  // Integer
//         System.out.println(getType(d));  // Double
//         d = 1022;
//         System.out.println(d);  // 1022
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//     } 
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }

// public class Program {
//     public static void main(String[] args) {

//         int[][] arr = new int[3][5];
       
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }

// public class program {
// 	public static void main(String[] args) {
// 		int i = 123; double d = i;
// 		System.out.println(i);  // 123
// 		System.out.println(d);  // 123.0
// 		d = 3.1415; i = (int)d;
// 		System.out.println(d);  // 3.1415
// 		System.out.println(i);  // 3
// 		d = 3.9415; i = (int)d;
// 		System.out.println(d);  // 3.9415
// 		System.out.println(i);  // 3
// 		byte b = Byte.parseByte("123");
// 		System.out.println(b);  // 123
// 		b = Byte.parseByte("123");
// 		System.out.println(b);  // NumberFormatException: Value out of range
// 	}
//  }

// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);       
//        int i = iScanner.nextInt();
//        System.out.println(i);       
//        iScanner.close();
//    } 
// }


// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
// 			fw.append('\n');
//             fw.write("line 4");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } 
// }


// Чтение, Вариант посимвольно
import java.io.*;
public class program {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else {
                System.out.print(ch);
            }
        }
    } 
}