package QLKS;

import java.util.Comparator;

public class SortByid implements Comparator<Nguoi> {
    @Override
    public int compare(Nguoi o1, Nguoi o2) {
        if (o1.getId()> o2.getId()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
