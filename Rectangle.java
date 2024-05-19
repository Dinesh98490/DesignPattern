public class Rectangle implements Shape{
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.length, this.width);
    }

    @Override
    public void draw() {

    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
}
