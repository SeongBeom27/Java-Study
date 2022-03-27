package Controller;

class A1 {          // 선언과 동시에 값을 대입했을 때
    int a = 3;
    final int b= 5;
    A1() {

    }
}

class A2 {          // 선언과 값의 대입을 분리했을 때
    int a;
    final int b;
    A2() {
        a = 3;
        b = 5;
    }
}

class A3 {          // final 필드값을 대입한 후에는 추가 값 대입 불가
    int a = 3;
    final int b = 5;
    A3() {
        a = 7;
        // b = 9; (불가능)
    }
}


public class final_controller {
     
}
