import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class TicketMaster {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

    }

    // made through the help of Parth
    public void library() throws IOException {
        File file = new File("H:\\AP Java\\TicketMaster\\src\\showData.txt");
        BufferedReader n = new BufferedReader(new FileReader(file));
        String ln = n.readLine();
        while (ln != null){
            String[] splitln = ln.split("");
            ln = n.readLine();
            Show show1 = new Show(splitln[0], splitln[1], splitln[2],splitln[3].replace("-","").replace(",",""),splitln[4]);
            Show.add(show1);
        }
    }

    public int binarySearch(ArrayList<Integer> list, int target)
    {
        int low = 0;
        int high = list.size() - 1;
        int middle = (low + high)/2;
        while (list.get(middle) != target && low <= high)
        {
            if (target < list.get(middle))
                high = middle - 1;
            else
                low = middle + 1;
            middle = (high + low)/2;
        }
        if (list.get(middle) == target)
            return middle; // value is found
        else
            return -1; // value is not found
    }

    public String citySearch(){

    }

    //public String sortByPer(ArrayList<String>)
}
