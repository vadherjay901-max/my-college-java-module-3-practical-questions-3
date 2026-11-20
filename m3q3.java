
class A {
    void display() {
        System.out.println("This is the Parent Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("This is Child Class B");
    }
}

class C extends A {
    void showC() {
        System.out.println("This is Child Class C");
    }
}

public class m3q3{
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();

        obj1.display();
        obj1.showB();

        obj2.display();
        obj2.showC();
    }
}
