import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Pen");
        items.add("Pencil");
        items.add("Box");
        for (String i : items) {
            if (i.indexOf("P") == 0) {
                System.out.println(i.indexOf("P"));
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}