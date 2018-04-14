package module10;

import java.util.ArrayList;


public class Library {

    private ArrayList<PrintedEdition> library;

    public Library(){
        library = new ArrayList<PrintedEdition>();
    }

    public ArrayList<PrintedEdition> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<PrintedEdition> library) {
        this.library = library;
    }

    public void addPrintEdition(PrintedEdition printedEdition){
        library.add(printedEdition);
    }

    public void deletePrintEdition(PrintedEdition printedEdition){
        library.remove(printedEdition);
    }

    @Override
    public String toString() {
        return "Library{" + "library=" + library + '}';
    }

    public ArrayList<PrintedEdition> findPrintedEdition(PrintedEdition printedEdition){
        ArrayList<PrintedEdition> print = new ArrayList<PrintedEdition>();
        for (PrintedEdition pr : library) {
            if (pr.equals(printedEdition)){
                print.add(pr);
            }
        }
        return print;
    }
}
