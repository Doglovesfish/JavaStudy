public class ArraysType {
    public static void main(String[] args) {
        int  a = 1;
        int[] b = new int[]{1,2,3};
        System.out.println(getType(a));
        System.out.println(getType(b));

    }
    private static String getType(Object o){
        return o.getClass().getName();
    }
}
