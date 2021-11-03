import java.util.*;

public class TreeSetTest {
    public static void main(String[] args){
        SortedSet<Item> parts = new TreeSet<>();
//        SortedSet<Item> parts = new java.util.TreeSet<>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widgt",4562));
        parts.add(new Item("Modern", 9912));



        System.out.println(parts);

        //借助Comparator对sort方式进行修改
        NavigableSet<Item> sortByDescription = new TreeSet<>(
                Comparator.comparing(Item::getDescription)
        );

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
