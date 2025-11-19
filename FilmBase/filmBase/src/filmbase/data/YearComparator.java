package filmbase.data;

import java.util.Comparator;

public class YearComparator implements Comparator<Film> {

    public int compare(Film o1, Film o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    public int compareTitle(Film f1, Film f2){
        return f1.getTitle().compareToIgnoreCase(f2.getTitle());
    }

}