// Circle.java
public class Circle implements Shape {
    @Override
    public Shape clone() {
        return null;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
