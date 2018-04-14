package module10;

import java.util.ArrayList;

public class Runner {

    public static void main(String args[]) {

        PrintedEdition poster = new Poster("Полирафия 1", "ЛСП", 100, "Концерт");
        PrintedEdition newspaper = new NewsPaper("Редактор", "РБК", 20, "новость 1", "новость 2");
        PrintedEdition dictionary = new Dictionary("Даль", "Толковый словарь", 140, "термин1", "термин2");

        Library library = new Library();
        library.addPrintEdition(poster);
        library.addPrintEdition(poster);
        library.addPrintEdition(newspaper);
        library.addPrintEdition(dictionary);
        library.deletePrintEdition(poster);

        PrintAsTable printTable = new PrintAsTable();
        printTable.print(library.getLibrary());

        PrintAsList printList = new PrintAsList();
        printList.print(library.getLibrary());

        ArrayList<PrintedEdition> foundPrintEdition1 = library.findPrintedEdition(poster);
        printTable.print(foundPrintEdition1);
    }
}
