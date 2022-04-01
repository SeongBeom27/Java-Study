package InnerClass;

class AB {
    int a = 3;
    void abc() {
        int b = 5;
        class BC {
            void bcd() {
                System.out.println(a);
                System.out.println(b);
                a = 5;
                // b = 7;   // 지역 이너 클래스에서 사용하는 지역 변수는 자동 final 처리
            }
        }
        BC bb = new BC();
        bb.bcd();
    }
}

public class LocalInnerClass {
    public static void test() {
        AB a = new AB();
        a.abc();
    }
}
