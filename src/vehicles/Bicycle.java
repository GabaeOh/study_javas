package vehicles;

import java.util.HashMap;

public class Bicycle {
    int price ;
    String color;
    HashMap<String, Object> spec;
    public Bicycle(){ //생성자는 class이름과 동일해야 되며, retrun값이 없다. 생성자는 자기 자체를 인스턴스화 한다는 역할이 명확하게 있음
        System.out.println("Bicycle - param empty");
    }
    public Bicycle(int price, String color){ //인스턴스화 시킬때 값 셋팅하여 바로 사용, 인스턴스화 될때 call하는 메서드
        this.price = price;//this는 변수를 밖에서 선언한것이다.(영역만 선언), 오른쪽 price는 파라미터의(해당영역의) price
        this.color = color;
    } 
    public String toString(){ //메서드 생성
        String str = "price : " + this.price + ", color : " + this.color;
        return str; 
    }
}
