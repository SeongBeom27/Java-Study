package Generic;

class Parent {
    <T extends Number> void print(T t) {
        System.out.println(t);
    }
}

class Child extends Parent {

}

public class GenericInheritance {
    public static void main(String[] args){
        Parent p = new Parent();
        p.<Integer>print(10);
        p.print(10);

        // 자식 클래스에서 제네릭 메서드 사용
        Child c = new Child();
        c.<Double>print(5.8);
        c.print(5.8);
    }
}
