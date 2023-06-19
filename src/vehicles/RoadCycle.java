package vehicles;

public class RoadCycle extends Bicycle{
    String p_name;
    public RoadCycle(String p_name) {
        this.p_name = p_name;
    }
    public String toString() {
        String str = "제품명 : " + this.p_name;
        return str;
    }
}
