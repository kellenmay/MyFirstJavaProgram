import java.util.TreeMap;

public class Check {
    public static void main(String[] args) {
        TreeMap tr = new TreeMap();
        tr.put("One", "A");
        tr.put(1, "B");
        tr.put(2, 3);
        tr.put(null, 4);
        System.out.println(tr);
    }
}