package HomeWork8;

public class Circle extends Ellipse implements Moveble, Scalable { //extends Ellipse
    public double radius;

    public Circle(double x, double y, double radius) {
        super(x, y, radius, radius);
        this.radius = radius;
    }

        public double getArea() {
        return (Math.PI * Math.sqrt(radius));
    }


    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }


    public void move(double dX, double dY) {
        this.x += dX;
        this.y += dY;
    }


    public void scale (double multiplier) {
        this.radius *= multiplier;
    }


}


