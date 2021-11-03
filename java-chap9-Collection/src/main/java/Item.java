import java.util.Objects;

public class Item implements Comparable<Item>{//实现了Comparable类，说明整个类是可以进行排序的
    private String description;
    private int partNumber;

    public Item(String description, int partNumber){
        this.description = description;
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return partNumber == item.partNumber && Objects.equals(description, item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    //实现了Comparable接口，并对c排序方式进行重写
    public int compareTo(Item other){
        //默认优先使用 partNumber进行排序
        int diff = Integer.compare((this.partNumber), other.partNumber);
        //description的优先级比较低
        return diff!=0 ? diff : description.compareTo(other.description);
    }

}
