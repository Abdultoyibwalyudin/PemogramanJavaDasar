package Chapter10.Exercise.Exercise_10_04;

public class Exercise_10_04 {
    public static void main(String[] args){
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 10.3);

        System.out.println("The distance between ("
                + point1.getX() + ", " + point1.getY() + ") and ("
                + point2.getX() + ", " + point2.getY() + ") is: " +
                point1.distance(point2));
    }
}
