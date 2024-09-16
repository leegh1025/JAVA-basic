package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류, ClassCastException 캐스팅을 잘못했다는 오류
        child2.childMethod(); //실행 불가

        //업캐스팅의 경우에는 자식을 뉴로 생성했을때 부모는 인스턴스가 함께 생성되기 때문에 안전하다!
        //다운 캐스팅의 경우에는 본인보다 하위타입의 인스턴스가 없는 부분에 접근하려하는것이기에 런타임 오류가 발생한다!!!
    }
}
