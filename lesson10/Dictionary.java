package module10;

import java.util.ArrayList;

public class Dictionary extends PrintedEdition {

    private ArrayList<String> listOfTermins = new ArrayList<String>();

    public Dictionary(String author, String name, int price, String termin1, String termin2) {
        setAuthor(author);
        setName(name);
        setPrice(price);
        listOfTermins.add(0, termin1);
        listOfTermins.add(1, termin2);
    }

    public ArrayList<String> getListOfTermins() {
        return listOfTermins;
    }
}
