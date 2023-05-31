// 다른 폴더내에 있을때 생성자를 이용하여 method를 불러 오는 법 
package cases; // 파일 위치값이 포함됨 package을 이용해서 

public class ClassSecond {
    public int third = 0;
    public ClassSecond(){

    }
    public ClassSecond(int first){
        this.third = first ;
    }
   public int getThird(){
    return this.third;
   }
}
