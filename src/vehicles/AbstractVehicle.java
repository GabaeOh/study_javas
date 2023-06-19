package vehicles;

abstract class AbstractVehicle {
    int speed = 0;
    int increament = 5;
    public int speedUp(int val);
    public int speedDown(int val) {
        this.speed = this.speed - this.increament;
        return this.speed;
    }
}