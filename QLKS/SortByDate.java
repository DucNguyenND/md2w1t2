package QLKS;

import java.util.Comparator;

public class SortByDate implements Comparator<Nguoi> {

    @Override
    public int compare(Nguoi o1, Nguoi o2) {
        if (o1.getDate().before(o2.getDate())){
            return 1;
        }
        else {
            return -1;
        }
    }
}
