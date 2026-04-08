
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilmStorage filmStorage = new FilmStorage();

        boolean isWork = true;
        while(isWork){
            System.out.println("1-add 2-show all films 3-sortFilmByYearNatural 4-sortFilmByYearReversed 5-sortFilmsByRatingNatural 6-sortFilmsByRatingReversed 7-find3NewestFilms 8-getRatingByCountryNatural 9-exit");
            int answer = scanner.nextInt();

            scanner.nextLine();
            if(answer == 1){
                System.out.println("Name:");
                String name = scanner.nextLine();


                System.out.println("Genre:");
                String genre = scanner.nextLine();

                System.out.println("Country:");
                String country = scanner.nextLine();

                System.out.println("Rating:");
                int rating = scanner.nextInt();

                System.out.println("Year:");
                int year = scanner.nextInt();

                Film film = new Film(name, genre, country, rating, year);
                filmStorage.addFilm(film);
            }
            else if(answer == 2){
                System.out.println("All films" + filmStorage.showAllFilms());
            }
            else if(answer == 3){
                System.out.println("smallerYearFirst:" + filmStorage.sortFilmByYearNatural());
            }
            else if(answer == 4){
                System.out.println("biggerYearFirst:" + filmStorage.sortFilmByYearReversed());

            }
            else if(answer == 5){
                System.out.println("smallerRatingFirst:" + filmStorage.sortFilmsByRatingNatural());
            }
            else if(answer == 6){
                System.out.println("biggerRatingFirst:" + filmStorage.sortFilmsByRatingReversed());
            }
            else if(answer == 7){
                System.out.println("3 Newest films: " + filmStorage.find3NewestFilms());
            }
            else if(answer == 8){
                System.out.println("Enter country:");
                String country = scanner.nextLine();

                System.out.println("Rating: " + filmStorage.getRatingByCountryNatural(country).stream().map(Film::getRating).toList());
            }

            else if(answer == 9){
                System.out.println("Exiting...");
                isWork = false;
            }
        }
    }
}
