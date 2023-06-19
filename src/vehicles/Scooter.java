package vehicles;

public class Scooter extends AbstractVehicle { // AbstractVehicle 상속
    @Override
    public int speedUp(int val) {
        this.speed = this.speed + this.increment;
        return this.speed;
    }
}
