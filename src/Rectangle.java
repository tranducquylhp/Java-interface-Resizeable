public class Rectangle extends Shape implements Resizeable {
    public double width = 1.0;
    public double height = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean fill, double width, double height) {
        super(color, fill);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + this.width + " and length=" + this.height + ", Area= " + this.getArea() +
                ", Perimeter= " + this.getPerimeter() + ", which is a subclass of " + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.height += this.height * percent / 100;
        this.width += this.width * percent / 100;
    }

}
