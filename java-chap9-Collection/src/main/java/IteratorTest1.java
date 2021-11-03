import java.util.*;

public class IteratorTest1 {
    public static void main(String[] args){
        List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        int N = list.size(); //如果修改list，使用N避免修改后list长度发生变化。
        ListIterator<Integer> iter = list.listIterator();


        for(int i=0; i<list.size(); i++){
            if(iter.hasNext())
                System.out.println(iter.next());
        }

        for(int i=0; i<list.size(); i++){
            if(iter.hasPrevious())
                System.out.println(iter.previous());
        }


        for(int i=0; i<N; i++){
            if(iter.hasNext()){
                iter.next();
                iter.remove();
            }
        }

        System.out.println();

        System.out.println(list.size());

    }
}
