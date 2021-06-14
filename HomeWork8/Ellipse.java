package HomeWork8;

public class Ellipse extends GeometricFigure implements Moveble, Scalable {
    private double radiusA;
    private double radiusB;

    public Ellipse (double x, double y, double radiusA, double radiusB) { // 2 radiuses A and B
        super(x, y);
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    public double getArea() {
        return (Math.PI * radiusA * radiusB);
    }


    public double getPerimeter() {
        return (4 * (Math.PI * radiusA * radiusB +
                (radiusA - radiusB) * (radiusA - radiusB)) / (radiusA + radiusB));
    }


    public void move(double dX, double dY) {
        this.x += dX;
        this.y += dY;
    }


    public void scale (double multiplier) {
        this.radiusA *= multiplier;
        this.radiusB *= multiplier;
    }


}

