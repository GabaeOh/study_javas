package animal;

public class HorseAnimalExtend implements InterfaceAnimal{
    int speed = 0;
    int increament = 12;
    int setLegs = 4;
    int setArms = 0;
    String setEnableSpeech = "NO";
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
