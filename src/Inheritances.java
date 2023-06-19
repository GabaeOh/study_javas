import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.MountainBike;
import vehicles.RoadCycle;

public class Inheritances {
    public static void main(String[] args) {
        try {
            // Object 확인
            //ObjectInheritances objectInheritances = new ObjectInheritances();

            //상속할 class 생성
            //Bicycle bicycle = new Bicycle(5500, "blue"); //만들어준 파라미터를 바로 사용하고 싶을때의 인스턴스화
            //System.out.println(bicycle.toString()); //toString을 활용하여 값이 제대로 들어갔는지 확인
            
            //상속화 활용
            //MountainBike mountainBike = new MountainBike();
            MountainBike mountainBike = new MountainBike(6200, "yellow", 5);

            RoadCycle roadCycle = new RoadCycle("이동환 자전거", "WHITE", 10000);
            System.out.println(roadCycle.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
