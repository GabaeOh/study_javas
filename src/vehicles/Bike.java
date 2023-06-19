package vehicles;

public class Bike implements Vehicle{

    int speed = 0;
    int increament = 5;
    @Override
    public int speedUp(int val) {
        this.speed = this.speed + increament;
        return this.speed;
    }

    @Override
    public int speedDown(int val) {
        this.speed -= increament;
        return this.speed;
    }
    
}
