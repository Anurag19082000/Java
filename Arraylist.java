
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anurag");
        list.add("parul");

        System.out.println(list);

        //sorting 
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number.add(3);
        Number.add(6);
        Number.add(4);
        Number.add(9);

        System.out.println(Number);
        Collections.sort(Number);
        System.out.println(Number);
    }
}
