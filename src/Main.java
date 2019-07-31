public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(6, 4);
        shapes[2] = new Square(3);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println(rectangle);
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square);
            }
        }
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circle.resize(200);
            } else if (shape instanceof Rectangle && !(shape instanceof Square)) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize(300);
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                square.resize(400);
            }
        }
        System.out.println();
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                System.out.println(circle);
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println(rectangle);
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square);
            }
        }
    }
}
