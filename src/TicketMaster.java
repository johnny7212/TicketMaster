import java.util.ArrayList;

public class TicketMaster {

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

    public String citySearch(ArrayList<String>                         )
}
