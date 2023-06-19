package vehicles;

public class RoadCycle extends Bicycle{
    String p_name;
    public RoadCycle(String p_name, String color, int price) {
        this.p_name = p_name;
        this.color = color;
        this.price = price;
    }
    public String toString() {
        String str = "제품명 : " + this.p_name + ", price : " + this.price + ", color : " + this.color ;
        return str;
    }
}
