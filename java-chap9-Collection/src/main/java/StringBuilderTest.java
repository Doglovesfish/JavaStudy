public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.length());

        sb.append(1);
        System.out.println(sb.length());
        sb.deleteCharAt(0);
        System.out.println(sb.length());
    }
}
