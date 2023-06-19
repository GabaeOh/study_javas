package animal;

public class HorseAnimal extends HorseAnimalExtend{
    public String toString() {
        String str = "legs : " + this.setLegs + ", arms : " + this.setArms + ", speech : " + this.setEnableSpeech;
        return str;
    }
    public String getSpeed() {
        HorseAnimalExtend horseAnimalExtend = new HorseAnimalExtend();
        this.speed = horseAnimalExtend.speed(2);
        String spd = "speed : " + this.speed + "km";
        return spd;
    }

}
