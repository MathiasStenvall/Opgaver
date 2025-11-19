package filmbase.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Film {
    private String title;
    private int age;
    private Collection<Genre> genres = new ArrayList<>();

    public Film(String title, int age, Genre... genre) {
        this.title = title;
        this.age = age;
        this.genres.addAll(List.of(genre));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return age == film.age && Objects.equals(title, film.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, age);
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
