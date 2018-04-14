package module10;

public class Poster extends PrintedEdition {

    private String event;

    public Poster(String author, String name, int price, String event) {
        super(author, name, price);
        this.event = event;
    }
}
