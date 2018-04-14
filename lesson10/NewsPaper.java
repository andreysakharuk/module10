package module10;

import java.util.ArrayList;

public class NewsPaper extends PrintedEdition {

    private ArrayList<String> news = new ArrayList<String>();

    public NewsPaper(String author, String name, int price, String news1, String news2) {
        super(author, name, price);
        news.add(0, news1);
        news.add(1, news2);
    }

    @Override
    public String toString() {
        return "Library{" + "library=" + + '}';
    }
}
