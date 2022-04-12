package Generic;

class Apple {

}

class Goods1 {
    private Apple apple = new Apple();

    public Apple get() {
        return apple;
    }

    public void set(Apple apple) {
        this.apple = apple;
    }
}

class Pencil {

}

class Goods2 {
    private Pencil pencil = new Pencil();

    public Pencil get() {
        return pencil;
    }

    public void set(Pencil pencil) {
        this.pencil = pencil;
    }
}

public class GenericEx1 {
    public static void main(String[] args) {
        Goods1 goods1 = new Goods1();
        goods1.set(new Apple());
        Apple apple = goods1.get();

        Goods2 goods2 = new Goods2();
        goods2.set(new Pencil());
        Pencil pencil = goods2.get();
    } 
}
