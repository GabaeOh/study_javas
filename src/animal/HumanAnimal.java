package animal;

public class HumanAnimal extends HumanAnimalExtend{
    public String toString() {
        String str = "legs : " + this.setLegs + ", arms : " + this.setArms + ", speech : " + this.setEnableSpeech;
        return str;
    }
        public String getSpeed() {
        this.speed += this.increament;
        String spd = "speed : " + this.speed + "km";
        return spd;
    }
}
