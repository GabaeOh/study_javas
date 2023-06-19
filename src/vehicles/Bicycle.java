package vehicles;

import java.util.HashMap;

public class Bicycle {
    public int price;
    public String color;
    public HashMap<String, Object> spec;
    public Bicycle() {
        System.out.println("Bicycle - param empty");
    }
    public Bicycle(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String toString() {
        String str = "price : " + this.price + ", color : " + this.color;
        return str;
    }
}
