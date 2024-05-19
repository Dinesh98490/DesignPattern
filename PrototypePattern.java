public class PrototypePattern {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());

        Rectangle cloned = (Rectangle) rectangle.clone();
        System.out.println(cloned.getLength());
        System.out.println(cloned.getWidth());

        System.out.println(rectangle == cloned);
    }

}
