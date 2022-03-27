package Class1;

class A {
    void abc() {
        System.out.println("A 클래스의 abc()");
    }
}

class B extends A {

    void abc() {
        System.out.println("B 클래스의 abc()");
    }
    
    void bcd() {
        super.abc();
    }
}

public class SuperKeyword_2 {
    public static void main(String[] args) {
        // 객체 생성
        B bb = new B();

        // 메서드 호출
        bb.bcd();
    }
}
