import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;

public class Inheritances {
    public static void main(String[] args) {
        try {
            // ObjectInheritances objectInheritances = new ObjectInheritances();
            Bicycle bicycle = new Bicycle(5500, "blue");
            System.out.println(bicycle.toString());
            
            MountainBike mountainBike = new MountainBike(4500, "red", 100);
            System.out.println(mountainBike.toString());

            System.out.println();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // return 0;
    }
}
