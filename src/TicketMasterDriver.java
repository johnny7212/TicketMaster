import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class TicketMasterDriver {

    public static void main(String[] args) {
        System.out.println("        ****Welcome to the Ticket Master Kiosk****");
        System.out.println("You may search shows by city as well as by performer and ticket price.");
        System.out.println("    Simply choose the option corresponding to your needs.");
        System.out.println("");
        System.out.println("1.Search by City\n" +
                "2.Sort by Performer (A-Z)\n" +
                "3.Sort by Performer (Z-A)\n" +
                "4.Sort by Price (High - Low)\n" +
                "5.Sort by Price (Low - High)\n" +
                "6.Quit\n\n\n");


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
