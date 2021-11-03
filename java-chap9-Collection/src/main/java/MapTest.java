import java.util.*;

public class MapTest {
    public static void main(String[] args){
        Map<String, Employee> staff = new HashMap<>();
        Employee res =  staff.put("144",new Employee("1","Amy Lee"));
        System.out.println(res);
        res = staff.put("144", new Employee("2","Amy2"));
        System.out.println(res);
        staff.put("567", new Employee("3","Harry Hacker"));
        staff.put("157",new Employee("4", "Gala Song"));

        System.out.println(staff);

        res =  staff.getOrDefault("17",new Employee("0","Default Employee"));

        res = staff.remove("1111");


        System.out.println(res);

        staff.forEach((k,v)
                ->System.out.println("key=" + k+", value="+v));
    }
}
