public class ClassFirsts {
   public int second = 0 ; // 밖에 나와있는 변수는 public으로 선언
   //sector, getor method을 사용하여 메소드를 갖고 나오는게 좋음 
    ClassFirsts(){  // 파라미터 값이 없다면 빈 ()
        System.out.println();
    }
    ClassFirsts(int first){ 
        this.second = first; // method내에서 'this'를 사용하면 class 내부에서 사용  
        //override
        // 이름은 동일한데 파라미터의 갯수를 바꾸면 다르게 인지해서 동일한 이름 사용 가능 
        System.out.println(first);
    }
    public int getsecond(){ // second의 값을 던져주기 위함 
        return this.second;
    }
}
