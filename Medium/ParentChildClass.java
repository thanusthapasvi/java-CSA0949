class Parent {
    void display() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is child class");
    }
}

public class ParentChildClass {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        Child child = new Child();
        child.displayChild();

        child.display();
    }
}
