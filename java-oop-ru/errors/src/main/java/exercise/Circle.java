package exercise;

// BEGIN
public class Circle {

    Point point;

    int radius;

    Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public double getSquare() throws NegativeRadiusException {

        if (this.radius < 0) {
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        }
        return Math.PI * (this.radius * this.radius);
    }

}
// END
