package vehicles;

public class Car implements Vehicle{
    int speed = 0;
    int increament = 20;
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
