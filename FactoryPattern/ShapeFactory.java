package lld_preperation.FactoryPattern;

public class ShapeFactory {
    public Shape getShapeInstance(String shapeType) {
        switch (shapeType) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                System.out.println("Invalid Shape Type: " + shapeType);
                return null;
        }
    }
}
