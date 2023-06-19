package animal;

public class HumanAnimal extends HumanAnimalExtend{
    public String toString() {
        String str = "legs : " + this.setLegs + ", arms : " + this.setArms + ", speech : " + this.setEnableSpeech;
        return str;
    }
        public String getSpeed() {
        HumanAnimalExtend humanAnimalExtend = new HumanAnimalExtend();
        this.speed = humanAnimalExtend.speed(1);
        String spd = "speed : " + this.speed + "km";
        return spd;
    }
}
