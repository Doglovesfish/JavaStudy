import java.util.*;
import java.util.stream.Collectors;

public class ArrayAndList {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        System.out.println(Arrays.toString(list.toArray()));

        Integer[] b = list.toArray(new Integer[0]);
        int[] a1 = list.stream().mapToInt(Integer::valueOf).toArray();
        System.out.println(Arrays.toString(a1));



    }
}
