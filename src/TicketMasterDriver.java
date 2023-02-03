import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("H:\\AP Java\\TicketMaster\\src\\showData.txt");
        Scanner data = new Scanner(file);
        System.out.println("Date \t\tPrice \t  Qty \tPerformer \t\t   City");
        System.out.println("--------------------------------------------------------------");
        while (data.hasNextLine()){
            System.out.println(data.nextLine());
        }
    }
}
