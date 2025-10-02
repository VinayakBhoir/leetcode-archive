import java.util.ArrayList;
import java.util.Collections;

public class ComputeDecimalRepresentation {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);
    }
}
