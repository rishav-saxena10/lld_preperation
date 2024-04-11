package lld_preperation.FactoryPattern;

public class Main {
    public static void main(String []args) {
        ShapeFactory shapefactory =  new ShapeFactory();
        Shape shape1 = shapefactory.getShapeInstance("CIRCLE");
        Shape shape2 = shapefactory.getShapeInstance("SQUARE");
        Shape shape3 = shapefactory.getShapeInstance("RECTANGLE");
        Shape shape4 = shapefactory.getShapeInstance("INVALID SHAPE");

        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
    }
}
