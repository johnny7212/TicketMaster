import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class TicketMasterDriver {
    public static void main(String[] args) {
        File file = new File("H:\\AP Java\\TicketMaster\\src\\showData.txt");
        System.out.println("Date \t\tPrice \t  Qty \tPerformer \t\t   City");
        System.out.println("--------------------------------------------------------------");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
