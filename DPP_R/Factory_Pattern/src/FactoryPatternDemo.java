public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("C");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("R");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("S");
        shape3.draw();
    }
}
