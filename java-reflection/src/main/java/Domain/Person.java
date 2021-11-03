package Domain;

public class Person {
    private int age;
    private String name;
    public String a;
    protected String b;
    String c;
    private String d;


    public Person() {

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("eat!!!!");
    }


    public void eat(String food){
        System.out.println("eat!!!!" + food);
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }
}
