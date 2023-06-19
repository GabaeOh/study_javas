import java.util.HashMap;
import java.util.Map;

import inheritances.ObjectInheritances;
import vehicles.Bicycle;
import vehicles.Bike;
import vehicles.Car;
import vehicles.MountainBike;
import vehicles.RoadCycle;
import vehicles.Scooter;
import vehicles.Vehicles;

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
            //MountainBike mountainBike = new MountainBike(6200, "yellow", 5);
            //System.out.println();

            // 상속화 실습
            // RoadCycle roadCycle = new RoadCycle("삼천리 이동환_가배 자전거", "skyblue", 12000);
            // System.out.println(roadCycle.toString());

            //구현하고 호출하기 
            // Car car = new Car();
            // int speed = car.speedUp(1);
            // speed = car.speedDown(2);

            // //bike 호출하기 
            // Vehicles bike = new Bike(); //interface(구현관계)는 해당 방법으로 선언하고 인스턴스화 
            // System.out.println();

            // Map<String, String> hashMap = new HashMap<>(); //해쉬맵 구현 방법 
            // 추상화 확인
            Scooter scooter = new Scooter();
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
