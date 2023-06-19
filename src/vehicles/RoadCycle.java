package vehicles;

public class RoadCycle extends Bicycle{
    String product_name;
    public RoadCycle(int price, String color, String product_name){ 
        this.product_name = product_name;
        super.price = price;
        super.color = color;
    }

    public String toString(){
        String str = "price : " + super.price + ", color : " + super.color 
                    + ", product name : " + this.product_name;
        return str;
    }
}
