package animal;

public class HumanAnimalExtend implements InterfaceAnimal{
    int speed = 0;
    int setArms = 2;
    int setLegs = 2;
    int increament = 3;
    String setEnableSpeech = "YES";
    @Override
    public int setLegs(int val) {
        return this.setLegs;
    }

    @Override
    public int setArms(int val) {
        return this.setArms;
    }

    @Override
    public String setEnableSpeech(int val) {
        return this.setEnableSpeech;
    }

    @Override
    public int speed(int val) {
        this.speed += this.increament;
        return this.speed;
    }
    
}
