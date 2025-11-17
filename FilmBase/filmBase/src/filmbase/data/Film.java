package filmbase.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Film {
    private String title;
    private int age;
    private Collection<Genre> genres = new ArrayList<>();

    public Film(String title, int age, Genre... genre) {
        this.title = title;
        this.age = age;
        this.genres.addAll(List.of(genre));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collection<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Collection<Genre> genres) {
        this.genres = genres;
    }

    public boolean hasGenre(Genre genre){
        return genres.contains(genre);
    }

    public void addGenre(Genre genre){
        this.genres.add(genre);
    }

    public String toString(){
        return title + " ("+age+")" + ": " + genres;
    }
}
