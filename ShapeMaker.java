public class ShapeMaker{
    private Shape circle;
    private Shape rectangle;
    private Shape square;


    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public Shape drawCircle(){
        circle.draw();
    }
    public Shape drawRectangle(){
        rectangle.draw();
    }
    public Shape drawSquare(){
        square.draw();
    }


}
public class FacadePattern {
    public static void main(String[] args) {
        ShapeMaker sm = new ShapeMaker();
        sm.drawCircle();
        sm.drawRectangle();
        sm.drawSquare();
    }
}
