package module10;

import java.util.ArrayList;

/**
 * Created by Andrei_Sakharuk on 4/14/2018.
 */
public class PrintAsList implements Printable {

    public void print(ArrayList<PrintedEdition> list) {
        for (PrintedEdition pe : list) {
                System.out.println("Автор = " + pe.getAuthor() + ", Имя = " + pe.getName() + ", Цена = " + pe.getPrice());
        }
    }
}
