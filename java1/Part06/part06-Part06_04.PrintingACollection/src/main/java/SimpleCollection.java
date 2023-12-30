
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        int n = elements.size();
        String messagelist = "";
        String message;
        if (n == 0) {
            message = ("The collection " + this.name + " is empty.");
        } else if ( n == 1) {
            message = ("The collection " + this.name + " has 1 element:\n");
            messagelist = elements.get(0);
        } else {
            message = ("The collection " + this.name + " has " + n + " elements:\n");
            for (String letter : elements) {
                messagelist += letter + "\n";
            }
        }
        return message + messagelist;
    }
    
}
