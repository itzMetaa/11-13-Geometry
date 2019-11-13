
package geometry;


public class Square extends Rectangle, Rhombus {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }
    
    @Override
    public double getB() {
        return a;
    }

    @Override
    public double getAlfa() {
        return 90;
    }
    
    
    @Override
    public String toString() {
        return "Square{" + "a=" + a + '}';
    }

    
    
    
}
