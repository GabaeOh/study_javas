import cases.ClassSecond; // 하위 폴더의 생성자를 인스턴스화를 시키기위해서는 import를 해야됨 

public class ClassMains {
    public static void main(String[] args) {
        try {
            ClassFirsts classFirsts = new ClassFirsts(); // no param /class만 리턴함 
            ClassFirsts classFirstsWithVar = new ClassFirsts(5); //one param, 
            int second = classFirstsWithVar.getsecond(); // 그 인스턴스화 fuction과 변수를 가져올수 있음
            ClassSecond ClassSecond= new ClassSecond(6);
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        //return 0;
    }
}
