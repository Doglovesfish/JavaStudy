import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashTable {
    public static void main(String[] args){
        Set<String> words = new HashSet<>();

        long totalTime = 0;

        try(Scanner in = new Scanner(System.in)){
            while (in.hasNext()){
                String word = in.next();
                if(words.equals("END"))
                    break;
                long callTime = System.currentTimeMillis();
                words.add(word);
                totalTime += System.currentTimeMillis()-callTime;
            }
        }

        Iterator<String> iter = words.iterator();
        for(int i=0; i<=20 && iter.hasNext(); i++){
            System.out.print(iter.next()+" ");
        }
        System.out.println(words.size() + "distinct words" + totalTime + "milliseconds");
    }
}
