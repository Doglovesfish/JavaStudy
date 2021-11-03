public class Employee {
    private String telephtone;
    private String name;

    public Employee(){

    }
    public Employee(String telephtone, String name){
        this.telephtone = telephtone;
        this.name = name;
    }

    public String getTelephtone() {
        return telephtone;
    }

    public void setTelephtone(String telephtone) {
        this.telephtone = telephtone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "telephtone='" + telephtone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
