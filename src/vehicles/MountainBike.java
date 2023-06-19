package vehicles;

public class MountainBike extends Bicycle{
    int seatHight;
    public MountainBike(int price, String color, int seatHight) {
        this.seatHight = seatHight;
        super.price = price;
        super.color = color;
    }
    public String toString() {
        String str = "price : " + super.price + ", color : " + this.color + ", hight : " + this.seatHight;
        return str;
    }
}
