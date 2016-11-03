import java.util.*;

public class Names {
    private ArrayList<String> names = new ArrayList<String>();

    public Names() {
        names.add("Vasya");
        names.add("Kolya");
    }

    public synchronized void add(String name) {
        names.add(name);
    }

    public synchronized String[] getNamesStrings() {
        String[] array = new String [names.size()];
        array = names.toArray(array);
        return array;
    }

    public synchronized void reset() {
        names.clear();
    }
}
