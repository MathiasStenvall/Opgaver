package filmbase.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PlayList {
    private List<Film> playList = new ArrayList<>();


    public boolean addFilm(Film film){
        if (!hasFilm(film)){
            playList.add(film);
            return true;
        } else {
            System.out.println("Film already in playList");
            return false;
        }
    }

    public void playFilm(){
        if (hasNext()) {
            System.out.println(playList.getFirst() + " is now playing");
            playList.removeFirst();
        }
    }

    public void NextFilm(){
        if (hasNext()) {
            System.out.println(playList.getFirst());
        }
    }

    public int filmAmount(){
        return playList.size();
    }

    public List<Film> getList(){
        return playList;
    }

    public void clearList(){
        playList.clear();
    }

    public boolean hasFilm (Film film){
        return playList.contains(film);
    }

    public boolean hasNext(){
        return !playList.isEmpty();
    }

    public void removeGenre(Genre genre){
        playList.removeIf(playList -> playList.hasGenre(genre));
    }

}
