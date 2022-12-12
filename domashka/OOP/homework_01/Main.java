import java.lang.System.Logger;

public class Main {
	public static void main(String[] args) {
		Logger logger = Logger.getAnonymousLogger();

		Notebook book1 = new Notebook("ID1");
		

		book1.setColor("red");
		book1.setHardDriveStorgate(1000);
		book1.setMemory(4096);
		book1.setModel("Intel 5");
		book1.setOperatingSystem("Windows XP");
		book1.setProcessor("Intel 8");
		book1.setScreenSize(19);
	}
}
