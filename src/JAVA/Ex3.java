package JAVA;
class Parent { int a = 10; }

class Child extends Parent {

    void display() {

        System.out.println(a);

        System.out.println(this.a);

        System.out.println(super.a);

    }

}



public class Ex3 {

    public static void main(String[] args) {

        Child ch = new Child();

        ch.display();

    }

}
