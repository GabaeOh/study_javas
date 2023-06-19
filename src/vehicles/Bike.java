package vehicles;

<<<<<<< HEAD
public class Bike implements Vehicles {
    int speed = 0;
    int increment = 5;

    @Override
    public int speedUp(int val) {
        this.speed = this.speed + this.increment;
=======
public class Bike implements Vehicle{

    int speed = 0;
    int increament = 5;
    @Override
    public int speedUp(int val) {
        this.speed = this.speed + increament;
>>>>>>> d8b873f1de4e8342cccd1771bb4334b0c560f9bc
        return this.speed;
    }

    @Override
    public int speedDown(int val) {
<<<<<<< HEAD
        this.speed = this.speed - this.increment;
        return 0;
    }

=======
        this.speed -= increament;
        return this.speed;
    }
    
>>>>>>> d8b873f1de4e8342cccd1771bb4334b0c560f9bc
}
