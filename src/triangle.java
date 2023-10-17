public class triangle extends shape {

    private double side1;
    private double side2;
    private double side3;

    public triangle(double side1, double side2, double side3, String color, Boolean filter) {
        super(color,true);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return this.getSide1() + this.getSide2() + this.getSide3();
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double S = p * (p - getSide1()) * (p - getSide2()) * (p - getSide3());
        double T = Math.pow(S, 2);
        return T;

    }

    @Override
    public String toString() {
        return "triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public static void main(String[] args) {
        triangle triangle1 = new triangle(5,4,3,"red",true);
        System.out.println(triangle1);
    }
}
