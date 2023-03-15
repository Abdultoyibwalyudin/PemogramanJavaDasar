package Chapter13.Exercise.Exercise_13_11;

public class Octagon extends GeometricObject
        implements Cloneable, Comparable<Octagon> {
    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override /* Return the area of this Octagon */
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override /* Return the perimeter of this Octagon */
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}
