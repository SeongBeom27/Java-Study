package Class1;

class C {
    void abc() {
        System.out.println("C 클래스의 abc()");
    }
}

class D extends C {
    void bcd() {
        System.out.println("D 클래스의 abc()");
    }
}


public class SuperKeyword_1 {
    public static void main(String[] args) {
        // 객체 생성
        D bb = new D();

        // 메서드 호출
        bb.bcd();
    }
}
