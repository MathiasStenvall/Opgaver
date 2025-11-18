package filmbase.app;

import filmbase.data.Film;
import filmbase.data.Genre;
import filmbase.data.PlayList;

import java.util.*;

public class FilmBase {
    private List<Film> allFilms = new ArrayList<>();
    HashSet<Genre> allGenres = new HashSet<>();


        public void start(){
            System.out.println("FilmBasen er startet");
            initFilm();
            // printList(allFilms);
            // testPlayList();
            // testFiltering();
            countGenres();
            genreHasFilms();
        }

        private void initFilm(){
            allFilms.add(new Film("The Godfather", 1972, Genre.Crime, Genre.Drama));
            allFilms.add(new Film("The Shawshank Redemption", 1994, Genre.Drama));
            allFilms.add(new Film("Schindler's List", 1993, Genre.Biography, Genre.Drama, Genre.History));
            allFilms.add(new Film("Raging Bull", 1980, Genre.Biography));
            allFilms.add(new Film("Casablanca", 1942, Genre.Romance));
            allFilms.add(new Film("Citizen Kane", 1941, Genre.Mystery));
            allFilms.add(new Film("Gone With The Wind", 1939, Genre.Drama));
            allFilms.add(new Film("The Wizard Of Oz", 1939, Genre.Adventure));
    }

    private void printList(List<Film> film){
            for (Film f: film){
                System.out.println(f);
            }
        System.out.println("");
    }

    public void testPlayList(){
            PlayList playList = new PlayList();
            playList.addFilm(allFilms.get(1));
            playList.addFilm(allFilms.get(4));
            playList.addFilm(allFilms.get(4));
            playList.addFilm(allFilms.get(7));

            while (playList.hasNext()){
                playList.playFilm();
                printList(playList.getList());
            }
            playList.playFilm();
        }

        private void testFiltering(){
            PlayList playList = new PlayList();
            playList.addFilm(allFilms.get(0));
            playList.addFilm(allFilms.get(1));
            playList.addFilm(allFilms.get(2));
            playList.addFilm(allFilms.get(3));
            printList(playList.getList());
            playList.removeGenre(Genre.Biography);
            printList(playList.getList());
        }

        public void countGenres(){
            for (Film f: allFilms){
                allGenres.addAll(f.getGenres());
            }
            System.out.println(allGenres);
        }

        public void genreHasFilms(){
            Map<Genre, Collection<Film>> genreFilms = new HashMap<>(Map.of());
            for (Film f: allFilms){
                for (Genre g: f.getGenres()){
                    genreFilms.putIfAbsent(g, new HashSet<>());
                    genreFilms.get(g).add(f);
                }
            }
            for (Genre g: genreFilms.keySet()){
                System.out.println("\nGenre: " + g);
                System.out.println("Film: ");
                for (Film f: genreFilms.get(g)){
                    System.out.println(f);
                }
            }
        }
}
