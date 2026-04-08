import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FilmStorage {

    List<Film> films = new ArrayList<>();

    public List<Film> showAllFilms(){
        return films;
    }
    public void addFilm(Film film){
        films.add(film);
    }

    public List<Film> sortFilmByYearNatural(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getYear))
                .toList();

    }
    public List<Film> sortFilmByYearReversed(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getYear).reversed())
                .toList();

    }
    public List<Film> sortFilmsByRatingNatural(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getRating))
                .toList();
    }
    public List<Film> sortFilmsByRatingReversed(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getRating).reversed())
                .toList();
    }

    public List<Film> find3NewestFilms(){
        return films.stream()
                .sorted(Comparator.comparing(Film::getYear))
                .limit(3).toList();
            

    }
    public List<Film> getRatingByCountryNatural(String country) {
        return films.stream()
                .filter(film -> country.equals(film.getCountry()))
                .sorted(Comparator.comparing(Film::getRating))
                .toList();
    }
}
