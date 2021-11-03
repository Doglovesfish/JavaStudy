import java.util.*;

public class mpPutTest {
    public static void main(String[] args) {
        Map<Integer, List> mp = new HashMap<>();
        List<Integer> t1 = new LinkedList<>();
        t1.add(1);
        mp.put(1,t1);
        mp.getOrDefault(1, new LinkedList<>()).add(2);
        System.out.println(mp.get(1));
        mp.getOrDefault(2, new LinkedList<>()).add(2);
        System.out.println(mp.get(2));
    }
}
