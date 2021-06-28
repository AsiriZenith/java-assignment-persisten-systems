import java.util.Date;

public class Movie {

    private int id;
    private String name;
    private String language;
    private String releaseDate;
    private String director;
    private String producer;
    private String duration;

    public Movie(int id, String name, String language, String releaseDate, String director, String producer, String duration) {
        this.id = id;
        this.name = name;
        this.language = language;
        this.releaseDate = releaseDate;
        this.director = director;
        this.producer = producer;
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
