package filmbase.data;

import java.util.Comparator;

public class TitleComparator implements Comparator<Film> {

    public int compare(Film f1, Film f2){
        String film1 = removeFiller(f1.getTitle());
        String film2 = removeFiller(f2.getTitle());
        return film1.compareToIgnoreCase(film2);
    }

    private String removeFiller(String title){
        if (title.length() > 4 && title.substring(0,4).equalsIgnoreCase("the ")) {
            return title.substring(4);
        }
        if (title.length() > 3 && title.substring(0,3).equalsIgnoreCase("an ")) {
            return title.substring(3);
        }
        if (title.length() > 2 && title.substring(0,2).equalsIgnoreCase("a ")) {
            return title.substring(2);
        }
        return title;
    }

}
