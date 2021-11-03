import java.util.Scanner;

public class BreakTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        read_data:
        for(i=1; i<10; i++){
            for(int j = 0; j<10; j++)
                if(j==5) break read_data;
        }
        System.out.println(i);

    }
}
