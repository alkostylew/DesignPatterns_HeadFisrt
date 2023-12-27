package headfirst.adapter.aleksApiAdapter;

public class Music {

    private String name;
    private String genre;
    public Music(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
}
