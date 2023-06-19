package vehicles;

//Abstract(선언하고, 구현)
abstract class AbstractVehicle {
    int speed = 0;
    int increment = 5;
    public int speedUp(int val); //선언만
    public int speedDown(int val){ //직접 구현
        this.speed = this.speed - this.increment;
        return this.speed;
    }
}
