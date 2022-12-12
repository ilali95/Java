
import java.util.ArrayList;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();

        Notebook book1 = new Notebook("id1");
        Notebook book2 = new Notebook("id2");
        Notebook book3 = new Notebook("id3");

        book1.setColor("red");
        book1.setHardDriveStorgate(1000);
        book1.setMemory(4096);
        book1.setModel("Intel 5");
        book1.setOperatingSystem("Windows XP");
        book1.setProcessor("Intel 8");
        book1.setScreenSize(19);

        logger.info(Notebook.infoOnFilter());
        Notebook.filterBy(2, 20);
        Notebook.filterBy(5, 500);
        ArrayList <Notebook>  setOfBooks  = new ArrayList<>();
        setOfBooks.add(book1);
        setOfBooks.add(book2);
        setOfBooks.add(book3);
        
        var result = Notebook.getNotebooks(setOfBooks);
        logger.info(String.valueOf(result));
    }
}
