public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("C")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("R")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("S")) {
            return new Square();
        }
        return null;
    }
}