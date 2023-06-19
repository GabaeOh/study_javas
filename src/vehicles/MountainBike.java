package vehicles;

public class MountainBike extends Bicycle { //bicycle를 상속받기 위함 extends
    int seatHight;
    public MountainBike(){ //생성자
        //상속된 변수를 사용할 수 있는 방법(super) 자기가 상속받은 클래쓰나 메서드일 경우/ this는 본인 메서드에서
    }

    public MountainBike(int price, String color, int seatHight){
        this.seatHight = seatHight; //내부 변수는 this
        super.price = price; //상속받은 class의 변수를 사용할 경우 super
        super.color = color;
    }

    public String toString(){ //메서드 생성 //super.toString을 쓰면 bike에 있는 toString을 가져오는 것
        String str = "price : " + super.price + ", color : " + super.color 
                    + ", seatHight : " + this.seatHight;
        return str;
    }
}
