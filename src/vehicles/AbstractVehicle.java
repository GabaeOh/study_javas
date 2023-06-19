package vehicles;

<<<<<<< HEAD
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
=======
abstract class AbstractVehicle {
    int speed = 0;
    int increament = 5;
    public int speedUp(int val);
    public int speedDown(int val) {
        this.speed = this.speed - this.increament;
        return this.speed;
    }
}
>>>>>>> d8b873f1de4e8342cccd1771bb4334b0c560f9bc
