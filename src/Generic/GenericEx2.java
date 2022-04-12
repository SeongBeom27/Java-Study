package Generic;

class MyClass<T> {
    private T t;
    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        MyClass<String> mc1 = new MyClass<String>();
        mc1.set("안녕");
        System.out.println(mc1.get());

        MyClass<Integer> mc2 = new MyClass<>(); // 제네릭 타입은 왼쪽 항과 동일하기 때문에 생략 가능
        mc2.set(100);
        System.out.println(mc2.get());
    }
}
