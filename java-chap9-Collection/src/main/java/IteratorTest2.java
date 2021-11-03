import java.util.*;

public class IteratorTest2 {
    public static void main(String[] args) {
        List<String> listA = new LinkedList<>(Arrays.asList("a","b","c","d","e"));
        List<String> listB = new LinkedList<>(Arrays.asList("A","B","C","D","E","F","G"));

        ListIterator<String> iterA = listA.listIterator();

        for (String value : listB) {
            if (iterA.hasNext()) {
                iterA.next();
            }
            iterA.add(value);
        }

        for(String s: listA){
            System.out.print(s+" ");
        }

        System.out.println("\n+++++++++++++++++++++");

        ListIterator<String> iterB = listB.listIterator();
        while(iterB.hasNext()){
            iterB.next();
            if(iterB.hasNext()) {
                iterB.next();
                iterB.remove();
            }
        }

        for(String s: listB){
            System.out.print(s+" ");
        }

        System.out.println("\n+++++++++++++++++++++");

        listA.removeAll(listB);
        System.out.println(listA);
    }
}
