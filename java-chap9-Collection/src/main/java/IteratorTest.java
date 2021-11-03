import java.util.*;

public class IteratorTest {
    public static void main(String[] args){
        Collection<String> rec = new HashSet<>(Arrays.asList("1","2","3","4","5"));

        Set<String> st = new HashSet<>();
        st.add("1");
        st.add("2");
        System.out.println(st.add("6"));
        System.out.println(st.add("2"));

        boolean flag = rec.add("1");
        System.out.println(flag);

        for(String s: rec){
            System.out.print(s+" ");
        }

        Iterator<String> iter = st.iterator();
        System.out.print('\n');
        while(iter.hasNext()){
            System.out.print(iter.next());
            System.out.print(' ');
        }
    }
}