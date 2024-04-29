package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        if (another.getArea() == this.getArea()) {
            return 0;
        } else if (another.getArea() > this.getArea()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return this.floorCount + " этажный коттедж площадью " + this.area + " метров";
    }
}
// END
