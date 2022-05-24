package QLKS;

import java.util.Comparator;

public class SortKsByPrice implements Comparator<KhachSan> {

    @Override
    public int compare(KhachSan o1, KhachSan o2) {
        if (o1.getPrice()> o2.getPrice()){
            return 1;
        }
        else {
            return -1;
        }
    }
}
