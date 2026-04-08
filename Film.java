public class Film {
    private String name;
    private String genre;
    private String country;
    private int rating;
    private int year;

    public Film(String name, String genre, String country, int rating, int year) {
        this.name = name;
        this.genre = genre;
        this.country = country;
        this.rating = rating;
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}
