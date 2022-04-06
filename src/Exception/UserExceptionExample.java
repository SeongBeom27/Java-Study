package Exception;

class MinusException extends Exception {
    public MinusException() {
        super();
    }

    public MinusException(String Message) {
        super(Message);
    }
}

// Over 100
class OverException extends Exception {
    public OverException() {
        super();
    }

    public OverException(String Message) {
        super(Message);
    }
}

class A {
    void checkScore(int score) throws MinusException, OverException {
        if(score < 0) {
            throw new MinusException("예외 발생: 음숫값 입력");
        }
        else if(score > 100) {
            throw new OverException("예외 발생: 100 Over");
        }
        else
            System.out.println("정상적인 값");
    }
}
public class UserExceptionExample {
    public static void main(String[] args) {
        A a = new A();
        try {
            a.checkScore(85);
//            a.checkScore(-1);
            a.checkScore(150);
        } catch (MinusException | OverException e) {
            System.out.println(e.getMessage());
        }
    }
}
