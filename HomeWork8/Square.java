package HomeWork8;

public class Square extends Rectangle implements Moveble, Scalable { //extends Rectangle
    public double height;


    public Square(double x, double y, double height) {
        super(x, y, height, height);
        this.height = height;
    }


    public double getArea() {
        return 2 * height;
    }


    public double getPerimeter() {
        return height * 4;
    }


    public void move(double dX, double dY) {
        this.x += dX;
        this.y += dY;
    }


    public void scale(double multiplier) {
        this.height *= multiplier;
    }

}